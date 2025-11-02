package org.example.dip.before;

/**
 * Módulo de bajo nivel (detalle de implementación).
 * Sabe cómo enviar un email específico.
 */
public class EmailSender {
    public void enviarEmail(String direccion, String mensaje) {
        System.out.println("EmailSender: Enviando EMAIL a '" + direccion + "' con mensaje: '" + mensaje + "'");
        // ... Lógica real de SMTP ...
    }
}
