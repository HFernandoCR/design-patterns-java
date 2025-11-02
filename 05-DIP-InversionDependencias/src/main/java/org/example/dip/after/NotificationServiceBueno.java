package org.example.dip.after;

/**
 * Módulo de alto nivel (lógica de negocio).
 * CUMPLE DIP: Depende de la abstracción (MessageSender).
 */
public class NotificationServiceBueno {

    // ¡Dependencia de la interfaz (abstracción)!
    private MessageSender sender;

    /**
     * Inyección de Dependencias (en este caso, por constructor).
     * El servicio no crea sus dependencias; se las "inyectan".
     */
    public NotificationServiceBueno(MessageSender sender) {
        this.sender = sender;
    }

    /**
     * Notifica a un usuario.
     * Este método no sabe si está enviando un email o un SMS.
     * Solo sabe que está usando un 'MessageSender'.
     */
    public void notificar(String destinatario, String mensaje) {
        System.out.println("NotificationServiceBueno: Preparando notificación para " + destinatario);
        sender.enviarMensaje(destinatario, mensaje);
    }
}