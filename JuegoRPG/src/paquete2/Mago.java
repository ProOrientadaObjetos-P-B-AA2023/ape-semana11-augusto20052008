package paquete2;

public class Mago extends Personaje {
    public int danioMago;
    public Mago() {}
    public Mago(int vida, int nivel, int danioMago) {
        super(vida, nivel);
        this.danioMago = danioMago;
    }
    public void ataque(Personaje personaje){
        if (super.vida>0){
            personaje.defensa(danioMago);
        }
    }
    public void defensa(int danio){
        if (super.vida>0){
            super.vida=super.vida-danio;
        }
    }
    public void calcularNivel(){
        super.vida=super.vidaInicial+100;
        this.danioMago=this.danioMago+20;
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
        return "Mago{" +super.toString()+
                "danioMago=" + danioMago +
                '}';
    }
}
