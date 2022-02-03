/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APPAEROPUERTO;

/**
 *
 * @author fani6
 */
public class Vuelo {

    private Pasajero[] pasajeros;
    private int hora;
    private int nvuelo;
    private String companyia;
    private String destino;
    private int total;

    public Vuelo(int hora, int nvuelo, String companyia, String destino) {
        this.hora = hora;
        this.nvuelo = nvuelo;
        this.companyia = companyia;
        this.destino = destino;
        pasajeros = new Pasajero[100];
        total = 0;
    }

    public Vuelo() {
        pasajeros = new Pasajero[100];
        total = 0;
    }

    public boolean vueloVacio() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vueloLleno() {
        if (total == 100) {
            return true;
        } else {
            return false;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getNvuelo() {
        return nvuelo;
    }

    public void setNvuelo(int nvuelo) {
        this.nvuelo = nvuelo;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean pasajeroRepetido(Pasajero p) {
        for (int i = 0; i < total; i++) {
            if (p.getId().toUpperCase().contains(pasajeros[i].getId().toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public void agregarPasajero(Pasajero p) {

        pasajeros[total] = p;
        total++;

    }

    public void eliminarPasajero(int pos) {
        if (total > 0 && pos >= 0) {
            for (int i = pos; i < total - 1; i++) {
                pasajeros[i] = pasajeros[i + 1];
            }

            total--;
        } else {
            System.err.println("ERROR.VUELO VACIO.");
        }

    }

    public Vuelo buscarPasajero(String id) {
        Vuelo encontrados = new Vuelo();

        for (int i = 0; i < total; i++) {
            if (pasajeros[i].getId().toUpperCase().contains(id.toUpperCase())) {
                encontrados.agregarPasajero(pasajeros[i]);

            }
        }

        return encontrados;
    }

    public Vuelo mostrarTripulantes() {
        Vuelo tripulante = new Vuelo();

        for (int i = 0; i < total; i++) {
            if (pasajeros[i].Tripulante() == 1) {
                tripulante.agregarPasajero(pasajeros[i]);

            }
        }

        return tripulante;
    }

    public void imprimirVuelo() {
        System.out.println("Salida: " + hora + " Nº Vuelo: " + nvuelo + " Companyia: " + companyia + " Destino: " + destino);
        if (total > 0) {
            System.out.println("Total pasajeros: " + total);
            for (int i = 0; i < total; i++) {
                System.out.print(i + ". ");
                pasajeros[i].imprimirPasajero();
            }
        } else {
            System.out.println("Total pasajeros = 0");
        }
    }

    public void imprimirTripulantes() {
        if (total > 0) {
            System.out.println("Total pasajeros: " + total);
            for (int i = 0; i < total; i++) {
                System.out.print(i + ". ");
                pasajeros[i].imprimirPasajero();
            }
        } else {
            System.out.println("Total tripulantes = 0");
        }
    }
}
