package org.example.bridge.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Bridge (Ej 2) ---");

        // Tenemos clases fijas para cada combinación
        Pago pago1 = new PagoUnicoStripe();
        pago1.procesar(100.00, "1234-5678-XXXX");

        System.out.println("---");

        Pago pago2 = new PagoRecurrentePaypal();
        pago2.procesar(50.00, "usuario@paypal.com");

        // ¿Qué pasa si queremos un "PagoRecurrente" con "Stripe"?
        // Necesitamos instanciar PagoRecurrenteStripe.
        Pago pago3 = new PagoRecurrenteStripe();
        pago3.procesar(30.00, "4567-8901-XXXX");

        // ¡Si quisiéramos "MercadoPago" tendríamos que crear 2 clases nuevas!

        System.out.println("----------------------------------------------");
    }
}