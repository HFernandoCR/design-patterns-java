package org.example.decorator.after;

/**
 * La Interfaz Componente.
 * Define la operación base que tanto el objeto real
 * como los decoradores implementarán.
 */
public interface IDataSource {
    void escribirDatos(String datos);
    String leerDatos();
}