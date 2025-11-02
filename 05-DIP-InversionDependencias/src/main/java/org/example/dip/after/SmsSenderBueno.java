package org.example.dip.after;

/**
 * Módulo de bajo nivel (Implementación 2).
 * Depende de la abstracción (implementa MessageSender).
 */
public class SmsSenderBueno implements MessageSender {
    @Override
    public void enviarMensaje(String numeroTelefono, String mensaje) {
        System.out.println("SmsSenderBueno: Enviando SMS al '" + numeroTelefono + "' con mensaje: '" + mensaje + "'");
        // ... Lógica real de la API de SMS ...
    }
}