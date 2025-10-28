package org.example.srp.before;

/**
 * Clase que VIOLA el Principio de Responsabilidad Única (SRP).
 * Tiene DOS responsabilidades: Registrar usuarios y Enviar notificaciones.
 */
public class ServicioUsuarioMalo {
    private EnviadorEmail enviadorEmail = new EnviadorEmail();

    /**
     * Registra un usuario Y envía un correo de bienvenida.
     * DOS responsabilidades juntas.
     */
    public void registrarUsuario(String nombre, String email) {
        // Validación básica
        if (nombre == null || email == null || !email.contains("@")) {
            System.err.println("Datos inválidos para " + nombre);
            return;
        }

        // 1. RESPONSABILIDAD: Registrar usuario (simulado)
        System.out.println("Guardando usuario '" + nombre + "' en la base de datos...");
        // ... Lógica de interacción con la base de datos ...
        System.out.println("Usuario '" + nombre + "' guardado.");

        // 2. RESPONSABILIDAD: Enviar correo de bienvenida
        System.out.println("Enviando email de bienvenida a '" + email + "'...");
        String asunto = "¡Bienvenido!";
        String cuerpo = "Hola " + nombre + ", gracias por registrarte.";
        try {
            enviadorEmail.enviar(email, asunto, cuerpo);
            System.out.println("Email enviado a '" + nombre + "'.");
        } catch (Exception e) {
            System.err.println("Error al enviar email a " + nombre + ": " + e.getMessage());
            // Si falla el email, ¿qué pasa con el registro? -> Acoplamiento de problemas
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar SRP ---");
        ServicioUsuarioMalo servicio = new ServicioUsuarioMalo();
        servicio.registrarUsuario("Alicia", "alicia@ejemplo.com");
        servicio.registrarUsuario("Beto", "beto@ejemplo.com");
        System.out.println("---------------------------------------");
    }
}
