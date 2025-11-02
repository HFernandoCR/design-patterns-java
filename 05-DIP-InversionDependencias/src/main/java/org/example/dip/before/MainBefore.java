package org.example.dip.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar DIP ---");

        // El servicio está acoplado internamente a EmailSender.
        // No tenemos control sobre cómo envía las notificaciones desde fuera.
        NotificationServiceMalo servicioNotificacion = new NotificationServiceMalo();

        servicioNotificacion.notificar("usuario123", "Tu pedido ha sido enviado");

        // ¿Qué pasa si queremos enviar por SMS? No podemos sin cambiar NotificationServiceMalo.

        System.out.println("---------------------------------------");
    }
}