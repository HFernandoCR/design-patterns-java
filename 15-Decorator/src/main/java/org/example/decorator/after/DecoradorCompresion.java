package org.example.decorator.after;

/**
 * Decorador Concreto 1.
 * Añade la funcionalidad de compresión.
 */
public class DecoradorCompresion extends DataSourceDecorador {

    public DecoradorCompresion(IDataSource fuente) {
        super(fuente);
    }

    // Sobrescribe el método para añadir su propia lógica
    @Override
    public void escribirDatos(String datos) {
        System.out.println("  > [DecoradorCompresion] Comprimiendo datos...");
        String datosComprimidos = "[COMPRIMIDO]" + datos + "[/COMPRIMIDO]";
        // Llama al método original del objeto envuelto (wrappee)
        super.escribirDatos(datosComprimidos);
    }

    @Override
    public String leerDatos() {
        // Llama al método original del objeto envuelto
        String datosComprimidos = super.leerDatos();
        System.out.println("  > [DecoradorCompresion] Descomprimiendo datos...");
        // Simula la descompresión (quitando las etiquetas)
        return datosComprimidos.replace("[COMPRIMIDO]", "").replace("[/COMPRIMIDO]", "");
    }
}