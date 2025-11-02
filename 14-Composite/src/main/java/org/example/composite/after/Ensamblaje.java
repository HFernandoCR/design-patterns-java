package org.example.composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * El Compuesto (Composite).
 * Representa un objeto complejo que tiene hijos (componentes).
 */
public class Ensamblaje implements IComponente {
    private String nombre;
    private List<IComponente> componentes = new ArrayList<>();

    public Ensamblaje(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * La operación clave del Composite.
     * Delega el cálculo a sus hijos y suma los resultados.
     */
    @Override
    public double getCosto() {
        System.out.println("Calculando ensamblaje: " + this.nombre);
        double costoTotal = 0;

        // El cliente ya no hace esto. ¡La lógica de recursión está en el objeto!
        for (IComponente componente : componentes) {
            costoTotal += componente.getCosto(); // Polimorfismo
        }
        return costoTotal;
    }

    // Sobrescribe los métodos de gestión de hijos
    @Override
    public void agregar(IComponente componente) {
        componentes.add(componente);
    }

    @Override
    public void remover(IComponente componente) {
        componentes.remove(componente);
    }
}