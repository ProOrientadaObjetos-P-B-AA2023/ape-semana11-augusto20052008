package paquete1;
import paquete2.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static ArrayList<Menu> Platos = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList platos = new ArrayList<Menu>();
        boolean bandera = true;
        String nombre;
        int opcion_1 = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a Restaurante La Cazuela");
        System.out.println("Ingresa su Nombre: ");
        nombre = entrada.nextLine();;
        /*
        do{
            try{
                Interfaz.menu_principal();
                opcion_1 = entrada.nextInt();
            } catch (InputMismatchException e) {
                Interfaz.manejoErrores(1);
                entrada.nextLine();
            }
            switch (opcion_1) {
                case 1 -> {
                    MenuCarta menuCarta1 = new MenuCarta("Carta 001"
                            , 4.50, 2.00
                            , 1.00, 1.50);
                    Cuenta.agregarMenu(menuCarta1);
                }
                case 2 -> {
                    MenuDia menuDia1 = new MenuDia("Dia 001"
                            , 7.00, 5.00, 1.00);
                }
                case 3 -> {
                    MenuNinos menuNinos1 = new MenuNinos("Niños 001"
                            , 5.50, 3.00, 1.00);
                }
                case 4 -> {
                    MenuEconomico menuEconomico1 = new MenuEconomico("Econo 001"
                            , 3.00, 25.00);
                }
                case 5 -> {
                    System.out.println("Muchas gracias por su preferencia.");
                    bandera = false;
                }
            }

        }while(bandera);

         */
        MenuNinos menuNinos1 = new MenuNinos("Niños 01", 4.50, 2.00, 1.50);
        MenuNinos menuNinos2 = new MenuNinos("Niños 02", 5.50, 3.00, 1.50);
        MenuEconomico menuEconomico = new MenuEconomico("Econo 001", 3.00, 25.00);
        MenuDia menuDia = new MenuDia("Dia 001", 7.00, 5.00, 1.00);
        MenuCarta menuCarta = new MenuCarta("Carta 001", 10.10, 6.00, 1.50, 10.00);

        Cuenta cuenta = new Cuenta(nombre, 10.0);

        cuenta.agregarMenu(menuNinos1);
        cuenta.agregarMenu(menuNinos2);
        cuenta.agregarMenu(menuEconomico);
        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuCarta);

        cuenta.imprimirFactura();
    }
}