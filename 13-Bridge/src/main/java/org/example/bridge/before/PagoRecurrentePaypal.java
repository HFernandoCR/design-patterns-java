package org.example.bridge.before;

public class PagoRecurrentePaypal extends Pago{
    @Override
    public void procesar(double monto, String email){
        System.out.println("Procesando pago RECURRENTE de $" + monto + " para " + email);
        // Lógica de recurrencia
        System.out.println("... (Recurrencia) Creando plan de facturación...");
        // Lógica de PayPal
        System.out.println("... (PayPal API) Creando acuerdo de facturación para " + email);
    }
}
