package org.example.bridge.after.procesador;

/**
 * Interfaz Implementadora (Implementor).
 * Define la API de bajo nivel para procesar un pago.
 */
public interface IPagoProcesador {
    void procesarPago(double monto);
    void crearSuscripcion(double montoMensual);
}