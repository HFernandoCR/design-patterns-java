package org.example.decorator.after;

/**
 * El Componente Concreto.
 * La clase base que tiene la funcionalidad principal (escribir/leer de disco).
 */
public class DataSourceArchivo implements IDataSource {
    private String archivo;
    private String contenido = ""; // Simulación del contenido del archivo

    public DataSourceArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void escribirDatos(String datos) {
        System.out.println("DataSourceArchivo: Escribiendo datos en '" + archivo + "'");
        this.contenido = datos;
    }

    @Override
    public String leerDatos() {
        System.out.println("DataSourceArchivo: Leyendo datos de '" + archivo + "'");
        return this.contenido;
    }
}