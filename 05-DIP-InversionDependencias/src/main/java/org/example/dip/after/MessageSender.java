package org.example.dip.after;

/**
 * La Abstracción (Interfaz).
 * Módulos de alto y bajo nivel dependerán de esta interfaz.
 */
public interface MessageSender {
    void enviarMensaje(String destinatario, String mensaje);
}