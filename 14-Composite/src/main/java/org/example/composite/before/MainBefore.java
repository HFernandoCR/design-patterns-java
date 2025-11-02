package org.example.composite.before;

public class MainBefore {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando ANTES de aplicar Composite ---");

        // Construir la estructura es difícil
        Ensamblaje patineta = new Ensamblaje("Patineta Completa");
        patineta.agregarComponente(new Pieza("Tabla", 30.0));

        Ensamblaje setDeRuedas = new Ensamblaje("Set de Ruedas");
        setDeRuedas.agregarComponente(new Pieza("Rueda", 5.0));
        setDeRuedas.agregarComponente(new Pieza("Rueda", 5.0));
        setDeRuedas.agregarComponente(new Pieza("Balero", 1.0));
        setDeRuedas.agregarComponente(new Pieza("Balero", 1.0));

        // Un ensamblaje dentro de otro
        patineta.agregarComponente(setDeRuedas);
        patineta.agregarComponente(setDeRuedas); // Otro set de ruedas

        CalculadoraCostoMala calculadora = new CalculadoraCostoMala();
        double costo = calculadora.calcular(patineta);

        System.out.println("Costo Total (Antes): $" + costo);
        System.out.println("--------------------------------------------");
    }
}