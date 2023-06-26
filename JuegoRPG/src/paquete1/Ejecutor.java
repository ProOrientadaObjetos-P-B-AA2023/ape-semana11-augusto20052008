package paquete1;

import paquete2.Personaje;
import paquete2.Guerrero;
import paquete2.Arquero;
import paquete2.Mago;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        boolean interruptor = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Personaje> personajes = new ArrayList<>();
        while (interruptor) {
            try {
                System.out.println("1.- CREAR PERSONAJE");
                System.out.println("2.- MOSTRAR ESTADISTICAS PERSONAJES");
                System.out.println("3.- EMPEZAR BATALLA (2 PERSONAJES NECESARIOS)");
                System.out.println("4.- SALIR");
                int opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        try {
                            System.out.println("1.- MAGO");
                            System.out.println("2.- GUERRERO");
                            System.out.println("3.- ARQUERO");
                            int opcP = sc.nextInt();
                            switch (opcP) {
                                case 1:
                                    System.out.println("INGRESE: VIDA(1-80), NIVEL, DAÑO(1-40)");
                                    personajes.add(new Mago(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                                    System.out.println("PERSONAJE CREADO CORRECTAMENTE");
                                    break;
                                case 2:
                                    System.out.println("INGRESE: VIDA(1-160), NIVEL, DAÑO(1-20)");
                                    personajes.add(new Guerrero(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                                    System.out.println("PERSONAJE CREADO CORRECTAMENTE");
                                    break;
                                case 3:
                                    System.out.println("INGRESE: VIDA(1-100), NIVEL, DAÑO(1-30)");
                                    personajes.add(new Arquero(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                                    System.out.println("PERSONAJE CREADO CORRECTAMENTE");
                                    break;
                                default:
                                    System.out.println("OPCION INVALIDA");
                                    break;
                            }

                        } catch (Exception err) {
                            System.out.println("INGRESE UNA OPCION VALIDA");
                        }
                        break;
                    case 2:
                        for (Personaje pers : personajes) {
                            System.out.println(pers);
                        }
                        System.out.println();
                        break;
                    case 3:
                        if (personajes.size() >= 2) {
                            int contador;
                            boolean batalla = true;
                            while (batalla) {
                                for (int i = 0; i < personajes.size(); i++) {
                                    if (personajes.get(i).getVida()){

                                        //Presentar Personajes
                                        contador=1;
                                        System.out.println();
                                        System.out.println("-----PERSONAJES-----");
                                        for (Personaje prs:personajes) {
                                            System.out.println("Personaje "+contador);
                                            System.out.println(prs);
                                            contador++;
                                        }

                                        //Ataque de personajes
                                        System.out.println();
                                        System.out.println("Turno Personaje "+(i+1));
                                        System.out.print("Ingrese el personaje que va a atacar: ");
                                        int personjeAtq=sc.nextInt()-1;
                                        if (personajes.get(personjeAtq).getVida()){
                                            personajes.get(i).ataque(personajes.get(personjeAtq));
                                        }else {
                                            System.out.println();
                                            System.out.println("Personaje Muerto");
                                            System.out.println("Pierdes Turno");
                                            System.out.println();
                                        }
                                    }else{
                                        System.out.println();
                                        System.out.println("PERSONAJE "+ (i+1) +" MUERTO");
                                        System.out.println();
                                    }
                                }

                                int personajesVivos = 0;
                                for (Personaje personaje:personajes) {
                                    if (personaje.getVida()) {
                                        personajesVivos++;
                                    }
                                }

                                if (personajesVivos == 1) {
                                    for (int j = 0; j < personajes.size(); j++) {
                                        if (personajes.get(j).getVida()) {
                                            personajes.get(j).calcularNivel();
                                            System.out.println("GANO PERSONAJE "+(j+1));
                                            batalla = false;
                                            for (Personaje prsj:personajes) {
                                                if (!prsj.getVida()){
                                                    prsj.setVida();
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }

                        } else {
                            System.out.println("2 PERSONAJES NECESARIOS");
                        }
                        break;
                    case 4:
                        interruptor = false;
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                }
            } catch (Exception err) {
                System.out.println("INGRESE UNA OPCION VALIDA");
                sc.nextLine();
            }
        }
    }
}