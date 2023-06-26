package paquete2;

public class MenuCarta extends Menu {
    public double valorGuarnicion;
    public double valorBebida;
    public double porcentajeAdicional;

    public MenuCarta() {
    }

    public MenuCarta(String nombrePlato, double valorInicial
            , double valorGuarnicion, double valorBebida
            , double porcentajeAdicional) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }
    public void calcularValorMenu() {
        this.valorMenu = this.valorInicial
                + this.valorBebida + this.valorGuarnicion
                + (this.valorInicial * (this.porcentajeAdicional/100));
    }

    @Override
    public String toString() {
        return "MenuCarta{" +
                "valorGuarnicion=" + valorGuarnicion +
                ", valorBebida=" + valorBebida +
                ", porcentajeAdicional=" + porcentajeAdicional +
                "} " + super.toString();
    }
}
