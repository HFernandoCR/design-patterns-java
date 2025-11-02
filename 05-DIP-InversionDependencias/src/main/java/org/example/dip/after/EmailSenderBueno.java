package org.example.dip.after;

/**
 * Módulo de bajo nivel (Implementación 1).
 * Depende de la abstracción (implementa MessageSender).
 */
public class EmailSenderBueno implements MessageSender {
    @Override
    public void enviarMensaje(String destinatarioEmail, String mensaje) {
        System.out.println("EmailSenderBueno: Enviando EMAIL a '" + destinatarioEmail + "' con mensaje: '" + mensaje + "'");
        // ... Lógica real de SMTP ...
    }
}