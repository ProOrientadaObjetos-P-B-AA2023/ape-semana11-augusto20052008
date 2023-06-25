package paquete2;

abstract public class Menu {
    public String nombrePlato;
    public double valorMenu;
    public double valorInicial;
    public Menu() {
    }
    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }
    public abstract void calcularValorMenu();

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "nombrePlato='" + nombrePlato + '\'' +
                ", valorMenu=" + valorMenu +
                ", valorInicial=" + valorInicial;
    }
}
