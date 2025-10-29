package org.example.lsp.after;

import java.util.Map;

/**
 * Clase Cliente que utiliza la abstracción ConfigLoader.
 * No necesita saber qué implementación concreta está usando.
 */
public class ConfigProcessor {
    public void process(ConfigLoader loader, String path) {
        System.out.println("\nProcesando con: " + loader.getClass().getSimpleName());
        try {
            // Llama al método según la interfaz, sin importar la implementación
            Map<String, String> config = loader.loadConfig(path);

            if (config.isEmpty()) {
                System.out.println("Advertencia: Configuración vacía o no cargada.");
            } else {
                System.out.println("Configuración obtenida:");
                config.forEach((key, value) -> System.out.println("  " + key + ": " + value));
            }
        } catch (Exception e) {
            System.err.println("Error procesando configuración: " + e.getMessage());
        }
    }
}