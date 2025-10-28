package org.example.srp.after;

/**
 * RESPONSABILIDAD ÚNICA: Enviar notificaciones (en este caso, emails).
 */
public class ServicioNotificacion {
    private EnviadorEmail enviadorEmail = new EnviadorEmail();

    public void enviarEmailBienvenida(Usuario usuario) {
        String asunto = "¡Bienvenido!";
        String cuerpo = "Hola " + usuario.getNombre() + ", gracias por registrarte.";
        System.out.println("Enviando email de bienvenida a '" + usuario.getEmail() + "'...");
        try {
            enviadorEmail.enviar(usuario.getEmail(), asunto, cuerpo);
            System.out.println("Email enviado a '" + usuario.getNombre() + "'.");
        } catch (Exception e) {
            System.err.println("Error al enviar email a " + usuario.getNombre() + ": " + e.getMessage());
            // El manejo de errores de notificación está aislado aquí
        }
    }
}