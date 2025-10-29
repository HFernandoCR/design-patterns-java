package org.example.lsp.after;

import java.util.Map;

/**
 * La Abstracción (puede ser interfaz o clase abstracta).
 * Define el contrato SIN CAMBIAR la firma en las subclases.
 */
public interface ConfigLoader {
    Map<String, String> loadConfig(String sourcePath);
}