package org.example.decorator.after;

public class MainAfter {
    public static void main(String[] args) {
        System.out.println("\n--- Ejecutando DESPUÉS de aplicar Decorator ---");

        String datosSensibles = "Estos son mis datos secretos";

        // 1. Empezamos con el objeto base
        IDataSource fuenteSimple = new DataSourceArchivo("datos.dat");
        System.out.println("\n--- 1. Escribiendo datos simples ---");
        fuenteSimple.escribirDatos(datosSensibles);
        System.out.println("Leído: " + fuenteSimple.leerDatos());


        // 2. Ahora queremos escribir datos ENCRIPTADOS
        // "Envolvemos" la fuente simple con el decorador de encriptación.
        IDataSource fuenteEncriptada = new DecoradorEncriptacion(
                new DataSourceArchivo("datos_seguros.dat")
        );
        System.out.println("\n--- 2. Escribiendo datos encriptados ---");
        fuenteEncriptada.escribirDatos(datosSensibles);
        // Al leer, el mismo decorador desencripta
        System.out.println("Leído: " + fuenteEncriptada.leerDatos());


        // 3. ¡Ahora queremos ENCRIPTAR y LUEGO COMPRIMIR!
        // Simplemente "anidamos" los decoradores.
        // El orden de anidación es el orden de ejecución.
        IDataSource fuenteComprimidaYEncriptada = new DecoradorCompresion(
                new DecoradorEncriptacion(
                        new DataSourceArchivo("datos_completos.dat")
                )
        );
        System.out.println("\n--- 3. Escribiendo datos Encriptados -> Comprimidos ---");
        fuenteComprimidaYEncriptada.escribirDatos(datosSensibles);

        System.out.println("\n--- 4. Leyendo datos (orden inverso) ---");
        // La lectura ocurre en orden inverso (primero descomprime, luego desencripta)
        System.out.println("Leído: " + fuenteComprimidaYEncriptada.leerDatos());

        System.out.println("-------------------------------------------");
    }
}