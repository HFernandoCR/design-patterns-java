package org.example.composite.after;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Composite ---");

        // La construcción de la estructura de árbol es uniforme
        // porque ambos (PiezaUnica y Ensamblaje) son IComponente.

        Ensamblaje patineta = new Ensamblaje("Patineta Completa");
        patineta.agregar(new PiezaUnica("Tabla", 30.0));

        Ensamblaje setDeRuedas = new Ensamblaje("Set de Ruedas");
        setDeRuedas.agregar(new PiezaUnica("Rueda", 5.0));
        setDeRuedas.agregar(new PiezaUnica("Rueda", 5.0));
        setDeRuedas.agregar(new PiezaUnica("Balero", 1.0));
        setDeRuedas.agregar(new PiezaUnica("Balero", 1.0));

        // Agregamos un ensamblaje dentro de otro
        patineta.agregar(setDeRuedas);
        patineta.agregar(setDeRuedas); // Otro set de ruedas

        // El cliente es MUY simple.
        // No necesita 'instanceof' ni lógica de recursión.
        // Simplemente trata a toda la patineta como un IComponente.
        System.out.println("\n--- Calculando Costo Total ---");
        double costoTotal = patineta.getCosto();

        System.out.println("Costo Total (Después): $" + costoTotal);
        System.out.println("-------------------------------------------");
    }
}