package org.example.decorator.before;

/**
 * VIOLA OCP y SRP.
 * Esta clase intenta manejar todo: escritura, compresión y encriptación.
 * La lógica está fuertemente acoplada usando 'if' (o booleanos en el constructor).
 */
public class DataSourceMalo {
    private String archivo;
    private boolean comprimir;
    private boolean encriptar;

    public DataSourceMalo(String archivo, boolean comprimir, boolean encriptar) {
        this.archivo = archivo;
        this.comprimir = comprimir;
        this.encriptar = encriptar;
    }

    public void escribirDatos(String datos) {
        String datosAGuardar = datos;

        System.out.println("DataSourceMalo: Escribiendo datos...");

        // ¡Lógica acoplada!
        if (encriptar) {
            System.out.println("  > Encriptando datos...");
            datosAGuardar = "[ENCRIPTADO]" + datosAGuardar + "[/ENCRIPTADO]";
        }

        if (comprimir) {
            System.out.println("  > Comprimiendo datos...");
            datosAGuardar = "[COMPRIMIDO]" + datosAGuardar + "[/COMPRIMIDO]";
        }

        System.out.println("  -> Escribiendo en '" + archivo + "': " + datosAGuardar);
    }
}