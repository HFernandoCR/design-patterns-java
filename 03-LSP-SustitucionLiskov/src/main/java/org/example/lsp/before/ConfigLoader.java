package org.example.lsp.before;

import java.util.Map;
import java.util.HashMap;

// Clase base (Superclase)
public class ConfigLoader {
    /**
     * Carga configuración desde una ruta.
     * Se espera que las subclases implementen esto.
     * ESTE ES EL CONTRATO BASE.
     */
    public Map<String, String> loadConfig(String filePath) {
        System.out.println("ConfigLoader: Cargando configuración base (vacía) para " + filePath);
        // Implementación base o podría ser abstracta
        return new HashMap<>();
    }
}