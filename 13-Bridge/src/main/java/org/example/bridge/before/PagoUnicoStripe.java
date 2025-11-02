package org.example.bridge.before;

public class PagoUnicoStripe extends Pago {
    @Override
    public void procesar(double monto, String cuenta) {
        System.out.println("Procesando pago ÚNICO de $" + monto + " para " + cuenta);
        // Lógica de Stripe
        System.out.println("... (Stripe API) Cargando $" + monto + " a la tarjeta " + cuenta);
    }
}
