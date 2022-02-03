/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APPAEROPUERTO;

/**
 *
 * @author fani6
 */
public class Pasajero {
    
    private String nombre;
    //Número identificativo, tanto dni como pasaporte
    private String id;
    //Variable que indica si es o no tripulante
    private int tripulante;

    public Pasajero(String nombre, String id, int tripulante) {
        this.nombre = nombre;
        this.id = id;
        setTripulante(tripulante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int Tripulante() {
        return tripulante;
    }

    public void setTripulante(int tripulante) {
        if (tripulante == 0 || tripulante == 1) {
            this.tripulante = tripulante;
        }else
            System.err.println("ERROR TRIPULANTE");
    }
    
    
    public void imprimirPasajero()
    {
        if (tripulante == 1)
            System.out.println("Nombre: " + nombre + "ID: " + id + " Posición: Es tripulante de vuelo.");
        else
            System.out.println("Nombre: " + nombre + "ID: " + id + " Posición: Es pasajero de vuelo.");
    }
    
}
