package org.example.builder.after;

/**
 * El Producto (Product).
 * Esta es la implementación moderna de Builder usando una
 * clase estática anidada (inner static class).
 */
public class ConexionBD {

    // Campos (finales para inmutabilidad)
    private final String host;
    private final int puerto;
    private final String baseDeDatos;
    private final String usuario;
    private final String password;
    private final boolean usarSSL;
    private final int timeoutConexion;

    // Constructor PRIVADO. Solo el Builder puede llamarlo.
    private ConexionBD(Builder builder) {
        this.host = builder.host;
        this.puerto = builder.puerto;
        this.baseDeDatos = builder.baseDeDatos;
        this.usuario = builder.usuario;
        this.password = builder.password;
        this.usarSSL = builder.usarSSL;
        this.timeoutConexion = builder.timeoutConexion;
    }

    public void conectar() {
        System.out.println("--- Conectando a BD (Builder) ---");
        System.out.println("Host: " + host + ":" + puerto);
        System.out.println("Base: " + baseDeDatos);
        System.out.println("Usuario: " + usuario);
        System.out.println("SSL: " + usarSSL);
        System.out.println("Timeout: " + timeoutConexion + "ms");
        System.out.println("... Conexión (simulada) exitosa.");
        System.out.println("---------------------------------");
    }

    // --- El Builder (Clase estática anidada) ---
    public static class Builder {
        // Campos requeridos
        private final String host;
        private final String baseDeDatos;

        // Campos opcionales (con valores por defecto)
        private int puerto = 3306; // Valor por defecto
        private String usuario = "root"; // Valor por defecto
        private String password = "";
        private boolean usarSSL = false;
        private int timeoutConexion = 5000; // Valor por defecto

        // Constructor del Builder con campos REQUERIDOS
        public Builder(String host, String baseDeDatos) {
            this.host = host;
            this.baseDeDatos = baseDeDatos;
        }

        // Métodos "setter" fluidos para campos opcionales
        public Builder conPuerto(int puerto) {
            this.puerto = puerto;
            return this; // Devuelve el propio builder
        }

        public Builder conCredenciales(String usuario, String password) {
            this.usuario = usuario;
            this.password = password;
            return this;
        }

        public Builder usarSSL(boolean usarSSL) {
            this.usarSSL = usarSSL;
            return this;
        }

        public Builder conTimeout(int timeout) {
            this.timeoutConexion = timeout;
            return this;
        }

        // El método final que construye el producto
        public ConexionBD construir() {
            // Aquí se pueden poner validaciones
            if (host.isEmpty() || baseDeDatos.isEmpty()) {
                throw new IllegalStateException("Host y BaseDeDatos son requeridos");
            }
            return new ConexionBD(this);
        }
    }
}