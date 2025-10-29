package org.example.lsp.after;

import java.util.Map;
import java.util.HashMap;

/**
 * Implementación 1: Carga desde archivo plano.
 * Cumple el contrato.
 */
public class FileConfigLoader implements ConfigLoader {
    @Override
    public Map<String, String> loadConfig(String filePath) {
        System.out.println("FileConfigLoader: Leyendo archivo de configuración desde " + filePath);
        // Lógica real... (simulado)
        Map<String, String> config = new HashMap<>();
        config.put("database.url", "jdbc:mysql://localhost:3306/mydb");
        config.put("server.port", "8080");
        System.out.println("FileConfigLoader: Configuración cargada.");
        return config;
    }
}