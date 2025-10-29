package org.example.lsp.before;

import java.util.Map;
import java.util.HashMap;

// Subclase que VIOLA LSP
public class EncryptedConfigLoaderMalo extends ConfigLoader {

    // VIOLACIÓN 1: Cambia la firma del método (sobrescritura inválida en Java estricto,
    // pero imaginemos que el lenguaje lo permitiera o que no usáramos @Override).
    // O más comúnmente, OCULTA el método padre en lugar de sobrescribirlo.
    // Necesita un parámetro extra que la clase base no tiene.
    public Map<String, String> loadConfig(String filePath, String password) {
        System.out.println("EncryptedConfigLoaderMalo: Descifrando y leyendo archivo desde " + filePath);
        if (!"secreto123".equals(password)) {
            System.err.println("EncryptedConfigLoaderMalo: Contraseña incorrecta!");
            return new HashMap<>(); // Devuelve vacío o lanza excepción
        }
        // Lógica para descifrar y leer (simulado)
        Map<String, String> config = new HashMap<>();
        config.put("api.key", "XYZ-ENCRIPTADO-ABC");
        config.put("timeout", "3000");
        System.out.println("EncryptedConfigLoaderMalo: Configuración descifrada y cargada.");
        return config;
    }

    // PROBLEMA: Si intentamos sobrescribir el método original para "cumplir"
    // no tenemos la contraseña. ¿Qué hacemos? Lanzar excepción o devolver vacío
    // también puede violar las expectativas del cliente (postcondiciones).
    @Override
    public Map<String, String> loadConfig(String filePath) {
        System.err.println("EncryptedConfigLoaderMalo: ERROR - Se necesita contraseña para cargar este archivo!");
        // Opcion 1: Lanzar excepción (rompe el flujo esperado si el cliente no la espera)
        // throw new UnsupportedOperationException("Se requiere contraseña");
        // Opcion 2: Devolver vacío (puede que el cliente no espere un mapa vacío)
        return new HashMap<>();
    }
}