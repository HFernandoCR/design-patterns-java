package org.example.srp.before;

// Simula el envío real de un correo electrónico
public class EnviadorEmail {
    public void enviar(String para, String asunto, String cuerpo) {
        System.out.println("--- EMAIL ---");
        System.out.println("Para: " + para);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
        System.out.println("-------------");
        // Aquí iría la lógica real de envío (SMTP, API, etc.)
    }
}
