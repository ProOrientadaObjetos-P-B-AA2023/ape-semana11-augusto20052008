package paquete2;

public class MenuEconomico extends Menu {
    public double porcentajeDescuento;
    public MenuEconomico() {
    }
    public MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public void calcularValorMenu() {
        this.valorMenu = this.valorInicial +
                (this.valorInicial * (this.porcentajeDescuento/100));
    }

    @Override
    public String toString() {
        return "MenuEconomico{" +
                "porcentajeDescuento=" + porcentajeDescuento +
                "} " + super.toString();
    }
}