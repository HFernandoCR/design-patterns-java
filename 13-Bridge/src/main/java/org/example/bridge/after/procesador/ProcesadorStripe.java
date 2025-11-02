package org.example.bridge.after.procesador;

/**
 * Implementador Concreto 1 (Stripe).
 */
public class ProcesadorStripe implements IPagoProcesador {
    private String apiKey;

    public ProcesadorStripe(String apiKey) {
        this.apiKey = apiKey;
        System.out.println("Stripe: Configurado con API Key.");
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Stripe: Cargando $" + monto + " (usando API Key " + apiKey + ")");
    }

    @Override
    public void crearSuscripcion(double montoMensual) {
        System.out.println("Stripe: Creando suscripción de $" + montoMensual + "/mes.");
    }
}