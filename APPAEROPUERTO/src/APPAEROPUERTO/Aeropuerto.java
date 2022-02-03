/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APPAEROPUERTO;

/**
 *
 * @author fani6
 */
public class Aeropuerto {

    private Vuelo[] vuelos;
    int total;

    public Aeropuerto() {
        vuelos = new Vuelo[100];
        total = 0;
    }

    public boolean hayVuelos() {

        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vuelosMaximo() {
        if (total == 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarPasajerosVacio(int pos) {
        if (vuelos[pos].vueloVacio() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarPasajerosLleno(int pos) {
        if (vuelos[pos].vueloLleno() == true) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirVuelos(int pos) {
        
        vuelos[pos].imprimirVuelo();
    }

    public void imprimirTodosLosVuelos() {
        for (int i = 0; i < total; i++) {
            System.out.print(i + ". ");
            vuelos[i].imprimirVuelo();
        }

    }

    public boolean vueloRepetido(Vuelo v) {
        for (int i = 0; i < total; i++) {
            if (v.getNvuelo() == vuelos[i].getNvuelo()) {
                return true;
            }
        }
        return false;
    }

    public void imprimirPasajeros(int pos) {
        vuelos[pos].imprimirVuelo();
    }

    public void agregarVuelo(Vuelo v) {
        
        if (vueloRepetido(v) == false)
        {
            vuelos[total] = v;
            total++;
            System.err.println("SE HA AGREGADO UN VUELO");
        }
        
        else
            System.out.println("VUELO EXISTENTE.");

    }

    public void cancelarVuelo(int pos) {
        for (int i = pos; i < total - 1; i++) {
            vuelos[i] = vuelos[i + 1];
        }

        total--;

    }

    public void agregarPasajeroVuelo(int pos, Pasajero p) {
        if (vuelos[pos].pasajeroRepetido(p) == false) {
            vuelos[pos].agregarPasajero(p);
        }else
            System.err.println("PASAJERO EXISTENTE");
    }

    public void eliminarPasajeroVuelo(int pos, int pospas) {
        vuelos[pos].eliminarPasajero(pospas);
    }

    public void cambiarHoraVuelo(int pos, int hora) {
        vuelos[pos].setHora(hora);
    }

    public Aeropuerto buscarVuelo(int id) {
        Aeropuerto encontrados = new Aeropuerto();

        for (int i = 0; i < total; i++) {
            if (id == vuelos[i].getNvuelo()) {
                encontrados.agregarVuelo(vuelos[i]);

            }
        }

        return encontrados;
    }

    public Vuelo buscarPasajerosVuelo(int pos, String id) {

        Vuelo v = vuelos[pos].buscarPasajero(id);

        return v;

    }

    public void mostrarAuxiliares(int pos) {
        Vuelo t = vuelos[pos].mostrarTripulantes();

        t.imprimirTripulantes();
    }

}
