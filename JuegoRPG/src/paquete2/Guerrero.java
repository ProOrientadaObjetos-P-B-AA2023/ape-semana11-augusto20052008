package paquete2;
import paquete2.Personaje;

public class Guerrero extends Personaje{
    public int danioGuerrero;
    public Guerrero() {}

    public Guerrero(int vida, int nivel,int danioGuerrero) {
        super(vida, nivel);
        this.danioGuerrero = danioGuerrero;
    }
    public void ataque(Personaje personaje){
        if (super.vida>0){
            personaje.defensa(danioGuerrero);
        }
    }
    public void defensa(int danio){
        if (super.vida>0){
            super.vida=super.vida-danio;
        }
    }
    public void calcularNivel(){
        super.vida=super.vidaInicial+100;
        this.danioGuerrero=this.danioGuerrero+20;
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
        return "Guerrero{" +super.toString()+
                "danioGuerrero=" + danioGuerrero +
                '}';
    }
}