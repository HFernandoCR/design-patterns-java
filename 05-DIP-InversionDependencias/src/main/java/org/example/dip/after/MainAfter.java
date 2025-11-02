package org.example.dip.after;

/**
 * Clase principal que actúa como el "Ensamblador" o "Inyector".
 * Es responsable de crear las implementaciones y pasarlas
 * al módulo de alto nivel.
 */
public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar DIP ---");

        // --- Escenario 1: Queremos enviar emails ---

        // Creamos la implementación de bajo nivel (Email)
        MessageSender emailSender = new EmailSenderBueno();

        // Inyectamos esa dependencia en el servicio de alto nivel
        NotificationServiceBueno servicioEmail = new NotificationServiceBueno(emailSender);

        // El servicio funciona sin saber que es un email
        servicioEmail.notificar("usuario@email.com", "Tu pedido enviado (vía email)");


        System.out.println("---");

        // --- Escenario 2: Queremos enviar SMS ---

        // Creamos la implementación de bajo nivel (SMS)
        MessageSender smsSender = new SmsSenderBueno();

        // Inyectamos la OTRA dependencia en un nuevo servicio
        NotificationServiceBueno servicioSms = new NotificationServiceBueno(smsSender);

        // El servicio funciona sin saber que es un SMS
        servicioSms.notificar("+529511234567", "Tu pedido enviado (vía SMS)");

        // El módulo 'NotificationServiceBueno' NUNCA se modificó.
        System.out.println("----------------------------------------");
    }
}