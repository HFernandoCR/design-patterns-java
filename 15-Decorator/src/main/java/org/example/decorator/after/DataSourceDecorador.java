package org.example.decorator.after;

/**
 * El Decorador Abstracto Base.
 * 1. Implementa la interfaz IDataSource.
 * 2. Mantiene una referencia (wrappee) a otro IDataSource (el objeto envuelto).
 * 3. Delega las operaciones al objeto envuelto.
 */
public abstract class DataSourceDecorador implements IDataSource {

    // Referencia al objeto envuelto (puede ser el real o otro decorador)
    protected IDataSource wrappee;

    public DataSourceDecorador(IDataSource fuente) {
        this.wrappee = fuente;
    }

    // Delega el trabajo al objeto envuelto
    @Override
    public void escribirDatos(String datos) {
        wrappee.escribirDatos(datos);
    }

    // Delega el trabajo al objeto envuelto
    @Override
    public String leerDatos() {
        return wrappee.leerDatos();
    }
}