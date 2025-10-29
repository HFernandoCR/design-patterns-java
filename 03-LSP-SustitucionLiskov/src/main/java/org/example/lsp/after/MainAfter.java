package org.example.lsp.after;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar LSP ---");

        ConfigProcessor processor = new ConfigProcessor();

        // Creamos las instancias de los cargadores
        ConfigLoader fileLoader = new FileConfigLoader();
        // La contraseña se pasa en la creación, no en la carga
        ConfigLoader encryptedLoaderBueno = new EncryptedConfigLoaderBueno("secreto123");
        ConfigLoader encryptedLoaderFallido = new EncryptedConfigLoaderBueno("incorrecta");


        // El procesador usa ambos cargadores a través de la misma interfaz
        // SIN necesidad de casting o conocer detalles específicos.
        processor.process(fileLoader, "/etc/app.conf");
        processor.process(encryptedLoaderBueno, "/secure/api.enc");
        processor.process(encryptedLoaderFallido, "/secure/another.enc"); // Simula contraseña incorrecta

        System.out.println("----------------------------------------");
    }
}