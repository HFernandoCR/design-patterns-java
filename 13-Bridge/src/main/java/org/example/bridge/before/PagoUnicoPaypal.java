package org.example.bridge.before;

public class PagoUnicoPaypal extends Pago{
    @Override
    public void procesar(double monto, String email) {
        System.out.println("Procesando pago ÚNICO de $" + monto + " para " + email);
        // Lógica de PayPal
        System.out.println("... (PayPal API) Enviando solicitud de pago a " + email);
    }
}
