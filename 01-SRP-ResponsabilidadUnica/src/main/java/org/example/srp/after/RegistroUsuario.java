package org.example.srp.after;

/**
 * Clase que coordina el proceso de registro, aplicando SRP.
 * Delega las responsabilidades a otras clases.
 */
public class RegistroUsuario {
    // Dependencias (en Spring serían inyectadas, aquí las instanciamos)
    private RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
    private ServicioNotificacion servicioNotificacion = new ServicioNotificacion();

    /**
     * Orquesta el registro: valida, guarda y notifica (delegando).
     */
    public void registrar(String nombre, String email) {
        // Validación básica (podría ser otra clase/responsabilidad -> Validator)
        if (nombre == null || email == null || !email.contains("@")) {
            System.err.println("Datos inválidos para registrar: " + nombre);
            return;
        }

        Usuario nuevoUsuario = new Usuario(nombre, email);

        // 1. Delegar la responsabilidad de guardar al Repositorio
        try {
            repositorioUsuario.guardar(nuevoUsuario);
        } catch (Exception e) {
            // Manejar error específico del guardado
            System.err.println("Fallo al guardar usuario '" + nombre + "': " + e.getMessage());
            // Decidimos no continuar si no se pudo guardar
            return;
        }

        // 2. Delegar la responsabilidad de notificar al ServicioNotificacion
        // Se ejecuta incluso si el guardado tuvo éxito pero el email falla después.
        servicioNotificacion.enviarEmailBienvenida(nuevoUsuario);

        System.out.println("Proceso de registro para '" + nombre + "' completado (puede que el email haya fallado).");
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar SRP ---");
        RegistroUsuario registro = new RegistroUsuario();
        registro.registrar("David", "david@ejemplo.com");
        registro.registrar("Elena", "elena@ejemplo.com");
        System.out.println("----------------------------------------");
    }
}