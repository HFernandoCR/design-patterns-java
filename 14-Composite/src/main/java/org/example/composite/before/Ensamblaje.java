package org.example.composite.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para partes complejas (Composite).
 * Almacena otras partes (que pueden ser Piezas o Ensamblajes).
 */
public class Ensamblaje {
    private String nombre;
    // ¡Problema! La lista debe contener diferentes tipos.
    // Usamos 'Object' lo cual es una mala práctica y requiere 'instanceof'.
    private List<Object> componentes = new ArrayList<>();

    public Ensamblaje(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComponente(Object componente) {
        componentes.add(componente);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Object> getComponentes() {
        return componentes;
    }
}