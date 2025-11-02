package org.example.prototype.before;

import java.util.List;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Prototype ---");

        // Equipamiento base para furgonetas de reparto
        List<String> equipamientoBase = List.of("GPS", "Radio", "Aire Acondicionado");

        // Tenemos que crear dos furgonetas idénticas (excepto matrícula, que iría en otro objeto)
        // El proceso de creación "costoso" se ejecuta DOS VECES.
        ConfiguracionVehiculoMala furgoneta1 = new ConfiguracionVehiculoMala(
                "Furgoneta Reparto", "Motor Diesel 4cil", 1500.0, equipamientoBase
        );
        furgoneta1.mostrarConfiguracion();

        System.out.println("---");

        ConfiguracionVehiculoMala furgoneta2 = new ConfiguracionVehiculoMala(
                "Furgoneta Reparto", "Motor Diesel 4cil", 1500.0, equipamientoBase
        );
        furgoneta2.mostrarConfiguracion();

        System.out.println("--------------------------------------------");
    }
}