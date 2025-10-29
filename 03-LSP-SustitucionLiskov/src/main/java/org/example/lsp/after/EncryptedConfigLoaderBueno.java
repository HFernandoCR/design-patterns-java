package org.example.lsp.after;

import java.util.Map;
import java.util.HashMap;

/**
 * Implementación 2: Carga desde archivo cifrado.
 * Cumple el contrato LSP. La información adicional (contraseña)
 * se maneja internamente o se recibe en el constructor.
 */
public class EncryptedConfigLoaderBueno implements ConfigLoader {
    private String password; // La contraseña se proporciona al crear el objeto

    // La dependencia extra (password) se inyecta en el constructor
    public EncryptedConfigLoaderBueno(String password) {
        this.password = password;
        System.out.println("EncryptedConfigLoaderBueno: Instanciado con contraseña.");
    }

    // La firma del método es IDÉNTICA a la interfaz
    @Override
    public Map<String, String> loadConfig(String filePath) {
        System.out.println("EncryptedConfigLoaderBueno: Intentando descifrar y leer desde " + filePath);
        if (!"secreto123".equals(this.password)) {
            System.err.println("EncryptedConfigLoaderBueno: Contraseña configurada incorrecta!");
            return new HashMap<>();
        }
        // Lógica para descifrar con this.password y leer (simulado)
        Map<String, String> config = new HashMap<>();
        config.put("api.key", "XYZ-ENCRIPTADO-ABC");
        config.put("timeout", "3000");
        System.out.println("EncryptedConfigLoaderBueno: Configuración descifrada y cargada.");
        return config;
    }
}