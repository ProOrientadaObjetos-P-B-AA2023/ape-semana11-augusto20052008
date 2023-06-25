abstract class Menu {
    private String nombrePlato;
    private double valorMenu;
    private double valorInicial;

    public Menu(String nombrePlato, double valorMenu, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicial = valorInicial;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public abstract void imprimirDetalles();
}

class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato, double valorMenu, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorMenu, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void imprimirDetalles() {
        System.out.println("\tValor helado: " + getValorHelado());
        System.out.println("\tValor pastel: " + getValorPastel());
    }
}

class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorMenu, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorMenu, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void imprimirDetalles() {
        System.out.println("\tPorcentaje Descuento: " + getPorcentajeDescuento());
    }
}

class MenuDia extends Menu {
    private double valorBebida;
    private double valorPostre;

    public MenuDia(String nombrePlato, double valorMenu, double valorInicial, double valorBebida, double valorPostre) {
        super(nombrePlato, valorMenu, valorInicial);
        this.valorBebida = valorBebida;
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void imprimirDetalles() {
        System.out.println("\tValor bebida: " + getValorBebida());
        System.out.println("\tValor postre: " + getValorPostre());
    }
}

class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nombrePlato, double valorMenu, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorMenu, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getPorcentajeServicio() {
        return porcentajeServicio;
    }

    public void imprimirDetalles() {
        System.out.println("\tValor guarnición: " + getValorGuarnicion());
        System.out.println("\tValor bebida: " + getValorBebida());
        System.out.println("\tPorcentaje Adicional: " + getPorcentajeServicio());
    }
}