package org.example.dip.before;

/**
 * Módulo de alto nivel (lógica de negocio).
 * VIOLA DIP: Depende directamente de una clase concreta (EmailSender).
 */
public class NotificationServiceMalo {

    // ¡Dependencia directa de la clase concreta (bajo nivel)!
    private EmailSender emailSender;

    public NotificationServiceMalo() {
        // El módulo de alto nivel es responsable de crear su dependencia de bajo nivel.
        this.emailSender = new EmailSender();
    }

    /**
     * Notifica a un usuario.
     * Este método está fuertemente acoplado a EmailSender.
     * Si queremos notificar por SMS, TENEMOS QUE MODIFICAR esta clase.
     */
    public void notificar(String usuario, String mensaje) {
        System.out.println("NotificationServiceMalo: Preparando notificación para " + usuario);
        // Llama directamente al método de la clase concreta
        emailSender.enviarEmail(usuario + "@example.com", mensaje);
    }
}