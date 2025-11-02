package org.example.bridge.before;

public class PagoRecurrenteStripe extends Pago {
    @Override
    public void procesar(double monto, String cuenta) {
        System.out.println("Procesando pago RECURRENTE de $" + monto + " para " + cuenta);
        // Lógica de recurrencia
        System.out.println("... (Recurrencia) Creando suscripción...");
        // Lógica de Stripe
        System.out.println("... (Stripe API) Creando cliente y suscripción para " + cuenta);
    }
}
