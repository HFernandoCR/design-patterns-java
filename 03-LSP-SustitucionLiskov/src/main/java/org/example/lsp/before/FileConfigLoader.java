package org.example.lsp.before;

import java.util.Map;
import java.util.HashMap;

// Subclase que cumple el contrato
public class FileConfigLoader extends ConfigLoader {
    @Override
    public Map<String, String> loadConfig(String filePath) {
        System.out.println("FileConfigLoader: Leyendo archivo de configuración desde " + filePath);
        // Lógica para leer un archivo de texto plano (simulado)
        Map<String, String> config = new HashMap<>();
        config.put("database.url", "jdbc:mysql://localhost:3306/mydb");
        config.put("server.port", "8080");
        System.out.println("FileConfigLoader: Configuración cargada.");
        return config;
    }
}