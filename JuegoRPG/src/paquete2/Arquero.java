package paquete2;
public class Arquero extends Personaje{
    private int danioArquero;
    public Arquero() {}
    public Arquero(int vida, int nivel, int danioArquero) {
        super(vida, nivel);
        this.danioArquero= danioArquero;
    }
    public void ataque(Personaje personaje){
        if (super.vida>0){
            personaje.defensa(danioArquero);
        }
    }
    public void defensa(int danio){
        if (super.vida>0){
            super.vida=super.vida-danio;
        }
    }
    public void calcularNivel(){
        super.vida=super.vidaInicial+100;
        this.danioArquero=this.danioArquero+20;
        super.nivel=super.nivel+1;
    }
    public boolean getVida(){
        if (super.vida>0){
            return true;
        }else{
            return false;
        }
    }
    public void setVida(){
        super.vida=super.vidaInicial;
    }

    @Override
    public String toString() {
        return "Arquero{" +super.toString()+
                "danioArquero:" + danioArquero +
                '}';
    }
}