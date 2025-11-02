package org.example.prototype.after;

import java.util.ArrayList;
import java.util.List;

/**
 * El Prototipo Concreto.
 * Implementa la interfaz IPrototype.
 */
public class ConfiguracionVehiculo implements IPrototype {

    private String modelo;
    private String motor;
    private double capacidadCargaKg;
    private List<String> caracteristicas;

    // Constructor para la creación inicial (costosa)
    public ConfiguracionVehiculo(String modelo, String motor, double capacidadCargaKg, List<String> caracteristicas) {
        System.out.println("Creando (costoso) prototipo " + modelo + " desde cero...");
        // Simula un proceso de configuración pesado
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        this.modelo = modelo;
        this.motor = motor;
        this.capacidadCargaKg = capacidadCargaKg;
        this.caracteristicas = caracteristicas;
    }

    /**
     * Constructor de copia (Copy Constructor).
     * Usado por el método clonar para crear la copia.
     * Es privado para forzar el uso de clonar().
     */
    private ConfiguracionVehiculo(ConfiguracionVehiculo prototipo) {
        System.out.println("Clonando (rápido) prototipo " + prototipo.modelo + "...");
        this.modelo = prototipo.modelo;
        this.motor = prototipo.motor;
        this.capacidadCargaKg = prototipo.capacidadCargaKg;
        // Importante: Crear una nueva lista para evitar compartir la misma referencia
        this.caracteristicas = new ArrayList<>(prototipo.caracteristicas);
    }

    /**
     * El método de clonación.
     * Delega la creación de la copia al constructor privado.
     */
    @Override
    public IPrototype clonar() {
        return new ConfiguracionVehiculo(this);
    }

    public void mostrarConfiguracion() {
        System.out.println("  Modelo: " + modelo + " (" + motor + ")");
        System.out.println("  Carga: " + capacidadCargaKg + "kg");
        System.out.println("  Equipamiento: " + caracteristicas);
    }
}