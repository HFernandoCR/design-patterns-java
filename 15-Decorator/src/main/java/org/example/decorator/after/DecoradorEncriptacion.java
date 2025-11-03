package org.example.decorator.after;

/**
 * Decorador Concreto 2.
 * Añade la funcionalidad de encriptación.
 */
public class DecoradorEncriptacion extends DataSourceDecorador {

    public DecoradorEncriptacion(IDataSource fuente) {
        super(fuente);
    }

    @Override
    public void escribirDatos(String datos) {
        System.out.println("  > [DecoradorEncriptacion] Encriptando datos...");
        String datosEncriptados = "[ENCRIPTADO]" + datos + "[/ENCRIPTADO]";
        super.escribirDatos(datosEncriptados);
    }

    @Override
    public String leerDatos() {
        String datosEncriptados = super.leerDatos();
        System.out.println("  > [DecoradorEncriptacion] Desencriptando datos...");
        // Simula la desencriptación
        return datosEncriptados.replace("[ENCRIPTADO]", "").replace("[/ENCRIPTADO]", "");
    }
}