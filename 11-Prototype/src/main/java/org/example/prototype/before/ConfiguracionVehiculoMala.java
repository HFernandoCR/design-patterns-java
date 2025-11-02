package org.example.prototype.before;

import java.util.List;
import java.util.ArrayList;

/**
 * VIOLA EL PATRÓN PROTOTYPE.
 * No hay forma fácil de copiar esta configuración.
 * El constructor es complejo y requiere muchos parámetros.
 */
public class ConfiguracionVehiculoMala {

    private String modelo;
    private String motor;
    private double capacidadCargaKg;
    private List<String> caracteristicas; // Equipamiento: GPS, A/C, etc.

    // Constructor complejo para crear una configuración
    public ConfiguracionVehiculoMala(String modelo, String motor, double capacidadCargaKg, List<String> caracteristicas) {
        System.out.println("Creando (costoso) " + modelo + " desde cero...");
        // Simula un proceso de configuración pesado (ej. cargar datos de fábrica)
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        this.modelo = modelo;
        this.motor = motor;
        this.capacidadCargaKg = capacidadCargaKg;
        this.caracteristicas = caracteristicas;
    }

    public void mostrarConfiguracion() {
        System.out.println("  Modelo: " + modelo + " (" + motor + ")");
        System.out.println("  Carga: " + capacidadCargaKg + "kg");
        System.out.println("  Equipamiento: " + caracteristicas);
    }
}