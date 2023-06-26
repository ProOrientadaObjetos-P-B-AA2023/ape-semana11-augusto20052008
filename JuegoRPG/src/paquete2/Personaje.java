package paquete2;

public abstract class Personaje {
    public int vidaInicial;
    public int vida;
    public int nivel;

    public Personaje() {}

    public Personaje(int vida, int nivel) {
        this.vida = vida;
        this.nivel = nivel;
        this.vidaInicial=vida;
    }
    public abstract void ataque(Personaje personaje);
    public abstract void defensa(int danio);
    public abstract void calcularNivel();
    public abstract boolean getVida();
    public abstract void setVida();

    @Override
    public String toString() {
        return String.format("Vida: %d; Nivel: %d; ",vida,nivel);
    }
}