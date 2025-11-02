package org.example.composite.after;

/**
 * La Hoja (Leaf).
 * Representa un objeto individual que no tiene hijos.
 */
public class PiezaUnica implements IComponente {
    private String nombre;
    private double costo;

    public PiezaUnica(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getCosto() {
        System.out.println("  Calculando pieza: " + this.nombre + " ($" + this.costo + ")");
        return this.costo;
    }

    // No sobrescribe agregar/remover, por lo que lanzará excepción si se intenta.
}