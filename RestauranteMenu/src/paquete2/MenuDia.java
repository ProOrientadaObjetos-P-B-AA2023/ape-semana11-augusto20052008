package paquete2;

public class MenuDia extends Menu {
    public double valorPostre;
    public double valorBebida;

    public MenuDia() {
    }

    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }
    public void calcularValorMenu() {
        this.valorMenu = this.valorPostre + this.valorBebida + this.valorInicial;
    }

}