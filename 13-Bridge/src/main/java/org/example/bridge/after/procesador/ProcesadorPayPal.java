package org.example.bridge.after.procesador;

/**
 * Implementador Concreto 2 (PayPal).
 */
public class ProcesadorPayPal implements IPagoProcesador {
    private String emailCliente;

    public ProcesadorPayPal(String emailCliente) {
        this.emailCliente = emailCliente;
        System.out.println("PayPal: Configurado con email de cliente.");
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("PayPal: Enviando solicitud de pago de $" + monto + " a " + emailCliente);
    }

    @Override
    public void crearSuscripcion(double montoMensual) {
        System.out.println("PayPal: Creando acuerdo de facturación de $" + montoMensual + "/mes para " + emailCliente);
    }
}