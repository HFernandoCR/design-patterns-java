package org.example.prototype.after;

import java.util.List;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Prototype ---");

        // Equipamiento base
        List<String> equipamientoBase = List.of("GPS", "Radio", "Aire Acondicionado");

        // 1. Creamos el PROTOTIPO (la plantilla) UNA SOLA VEZ.
        // Este es el único paso costoso.
        ConfiguracionVehiculo prototipoFurgoneta = new ConfiguracionVehiculo(
                "Furgoneta Reparto", "Motor Diesel 4cil", 1500.0, equipamientoBase
        );

        System.out.println("--- Prototipo creado. Listo para clonar. ---");

        // 2. Creamos la furgoneta 1 clonando el prototipo (rápido)
        ConfiguracionVehiculo furgoneta1 = (ConfiguracionVehiculo) prototipoFurgoneta.clonar();
        furgoneta1.mostrarConfiguracion();

        System.out.println("---");

        // 3. Creamos la furgoneta 2 clonando el prototipo (rápido)
        ConfiguracionVehiculo furgoneta2 = (ConfiguracionVehiculo) prototipoFurgoneta.clonar();
        furgoneta2.mostrarConfiguracion();

        // Verificamos que no son el mismo objeto en memoria
        System.out.println("¿Furgoneta 1 y 2 son el mismo objeto? " + (furgoneta1 == furgoneta2));

        System.out.println("-------------------------------------------");
    }
}