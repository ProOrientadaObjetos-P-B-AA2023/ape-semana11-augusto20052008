package paquete2;

public class MenuNinos extends Menu {
    public double valorHelado;
    public double valorPastel;

    public MenuNinos() {
    }

    public MenuNinos(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }
    public void calcularValorMenu() {
        this.valorMenu = this.valorHelado + this.valorPastel + this.valorInicial;
    }

    @Override
    public String toString() {
        return "MenuNinos{" +
                "valorHelado=" + valorHelado +
                ", valorPastel=" + valorPastel +
                "} " + super.toString();
    }
}