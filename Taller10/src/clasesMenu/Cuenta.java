package clasesMenu;
import java.util.ArrayList;
public class Cuenta {
    public String nombreCliente;
    public ArrayList lista = new ArrayList<>();
    public double iva;
    public double subTotal;
    public double pagoTotal;


    public Cuenta() {
    }

    public Cuenta(String nombreCliente, ArrayList lista, double IVA) {
        this.nombreCliente = nombreCliente;
        this.lista = lista;
        this.iva = iva;
    }
    public void establecerSubtotal(){
        for (int i = 0; i < lista.size(); i++) {
            this.subTotal += lista.get(i).calcularValorMenu();
        }
    }
}
