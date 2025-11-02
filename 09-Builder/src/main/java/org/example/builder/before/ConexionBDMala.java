package org.example.builder.before;

/**
 * VIOLA EL PATRÓN BUILDER.
 * Usa un constructor "monstruoso" con demasiados parámetros.
 */
public class ConexionBDMala {

    /**
     * Problemas:
     * 1. ¿Qué significa el 'true'? ¿Qué número es el puerto y cuál el timeout?
     * 2. Si solo quiero usar el host y la BD (y el resto por defecto),
     * igual estoy obligado a pasar todos los demás parámetros.
     * 3. Es muy fácil equivocarse en el orden.
     */
    public ConexionBDMala(String host, int puerto, String baseDeDatos, String usuario, String password, boolean usarSSL, int timeoutConexion) {

        System.out.println("--- Conectando a BD (Mala) ---");
        System.out.println("Host: " + host + ":" + puerto);
        System.out.println("Base: " + baseDeDatos);
        System.out.println("Usuario: " + usuario);
        System.out.println("SSL: " + usarSSL);
        System.out.println("Timeout: " + timeoutConexion + "ms");
        System.out.println("... Conexión (simulada) exitosa.");
        System.out.println("------------------------------");
    }
}