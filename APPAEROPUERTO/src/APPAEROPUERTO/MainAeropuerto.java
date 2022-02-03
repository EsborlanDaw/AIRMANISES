/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APPAEROPUERTO;

import java.util.Scanner;

/**
 *
 * @author fani6
 */
public class MainAeropuerto {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Aeropuerto aeropuerto = new Aeropuerto();
        Vuelo v = new Vuelo();
        Pasajero p;
        int hora, pos, nvuelo, tripulante;
        String companyia, destino, n, id;

        int op;

        do {
            System.out.println("*****AEROPUERTO MANISES DE VALENCIA*****");
            System.out.println("|----------------MENU------------------|");
            System.out.println("|   1. Ver vuelos.                     |");
            System.out.println("|   2. Ver pasajeros de un vuelo.      |");
            System.out.println("|   3. Agregar vuelo.                  |");
            System.out.println("|   4. Cancelar vuelo.                 |");
            System.out.println("|   5. Agregar pasajero.               |");
            System.out.println("|   6. Eliminar pasajero.              |");
            System.out.println("|   7. Cambiar vuelo de hora.          |");
            System.out.println("|   8. Buscar vuelo.                   |");
            System.out.println("|   9. Buscar pasajero.                |");
            System.out.println("|   10.Mostrar tripulantes de un vuelo.|");
            System.out.println("|   0. Salir                           |");
            System.out.println("|--------------------------------------|");
            op = cin.nextInt();
            System.out.println("OPCIÓN: ");

            switch (op) {
                case 1:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        aeropuerto.imprimirTodosLosVuelos();
                    }

                    break;
                case 2:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {

                        aeropuerto.imprimirTodosLosVuelos();
                        System.out.println("Indica posición de vuelo: ");
                        pos = cin.nextInt();
                        if (aeropuerto.comprobarPasajerosVacio(pos) == true) {
                            System.err.println("NO HAY PASAJEROS");
                        } else {
                            aeropuerto.imprimirPasajeros(pos);
                        }
                    }

                    break;
                case 3:
                    if (aeropuerto.vuelosMaximo() == true) {
                        System.err.println("MAXIMO DE AVIONES ALCANZADO");
                    } else {
                        System.out.println("Hora: ");
                        hora = cin.nextInt();
                        System.out.println("Nº Vuelo: ");
                        nvuelo = cin.nextInt();
                        cin.nextLine();
                        System.out.println("Compañia: ");
                        companyia = cin.nextLine();
                        System.out.println("Destino: ");
                        destino = cin.nextLine();

                        v = new Vuelo(hora, nvuelo, companyia, destino);

                        aeropuerto.agregarVuelo(v);
                    }

                    break;

                case 4:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        aeropuerto.imprimirTodosLosVuelos();

                        System.out.println("Vuelo a eliminar: ");
                        pos = cin.nextInt();

                        aeropuerto.cancelarVuelo(pos);
                    }
                    break;
                case 5:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        aeropuerto.imprimirTodosLosVuelos();
                        System.out.println("Indica vuelo: ");

                        pos = cin.nextInt();
                        cin.nextLine();

                        if (aeropuerto.comprobarPasajerosLleno(pos) == true) {
                            System.err.println("PASAJEROS MAXIMOS ALCANZADOS");
                        } else {

                            
                            System.out.println("Nombre: ");
                            n = cin.nextLine();
                            System.out.println("ID: ");
                            id = cin.nextLine();
                            System.out.println("1 Tripulante 0 No");
                            tripulante = cin.nextInt();

                            p = new Pasajero(n, id, tripulante);
                            aeropuerto.agregarPasajeroVuelo(pos, p);
                        }
                    }
                    break;
                case 6:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        aeropuerto.imprimirTodosLosVuelos();
                        System.out.println("Indica vuelo: ");
                        pos = cin.nextInt();
                        if (aeropuerto.comprobarPasajerosVacio(pos) == true) {
                            System.err.println("NO HAY PASAJEROS");
                        } else {
                            aeropuerto.imprimirVuelos(pos);
                            System.out.println("Indica pasajero: ");
                            int pas = cin.nextInt();

                            aeropuerto.eliminarPasajeroVuelo(pos, pas);
                        }
                    }
                    break;

                case 7:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        aeropuerto.imprimirTodosLosVuelos();
                        System.out.println("Elige el vuelo: ");
                        pos = cin.nextInt();
                        System.out.println("Indica hora: ");
                        hora = cin.nextInt();

                        aeropuerto.cambiarHoraVuelo(pos, hora);
                    }

                    break;
                case 8:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        System.out.println("Introduce numero de vuelo: ");
                        nvuelo = cin.nextInt();

                        Aeropuerto a = aeropuerto.buscarVuelo(nvuelo);

                        a.imprimirTodosLosVuelos();
                    }

                    break;
                case 9:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        aeropuerto.imprimirTodosLosVuelos();
                        System.out.println("Indica vuelo: ");
                        pos = cin.nextInt();
                        if (aeropuerto.comprobarPasajerosVacio(pos) == true) {
                            System.err.println("NO HAY PASAJEROS");
                        } else {
                            cin.nextLine();
                            System.out.println("Introduce id pasajero: ");
                            id = cin.nextLine();

                            Vuelo b = aeropuerto.buscarPasajerosVuelo(pos, id);

                            b.imprimirVuelo();
                        }
                    }

                    break;
                case 10:
                    if (aeropuerto.hayVuelos() == true) {
                        System.err.println("NO HAY VUELOS");
                    } else {
                        aeropuerto.imprimirTodosLosVuelos();
                        System.out.println("Indica vuelo: ");
                        pos = cin.nextInt();
                        if (aeropuerto.comprobarPasajerosVacio(pos) == true) {
                            System.err.println("NO HAY PASAJEROS");
                        } else {
                            aeropuerto.mostrarAuxiliares(pos);
                        }
                    }
                    break;

            }

        } while (op != 0);

    }

}
