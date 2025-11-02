package org.example.composite.after;

/**
 * La Interfaz Componente.
 * Define la operación común para Hojas (PiezaUnica)
 * y Compuestos (Ensamblaje).
 */
public interface IComponente {
    String getNombre();
    double getCosto();

    // Métodos para gestionar hijos (opcionales).
    // Los dejamos con implementaciones por defecto para que las Hojas no
    // tengan que implementarlos (siguiendo ISP en cierto modo).
    default void agregar(IComponente componente) {
        throw new UnsupportedOperationException("No se puede agregar a una pieza única");
    }

    default void remover(IComponente componente) {
        throw new UnsupportedOperationException("No se puede remover de una pieza única");
    }
}