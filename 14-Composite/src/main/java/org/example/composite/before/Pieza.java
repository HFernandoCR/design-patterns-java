package org.example.composite.before;

/**
 * Clase para partes simples (Leaf).
 * No tiene una interfaz común con Ensamblaje.
 */
public class Pieza {
    private String nombre;
    private double costo;

    public Pieza(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }
}