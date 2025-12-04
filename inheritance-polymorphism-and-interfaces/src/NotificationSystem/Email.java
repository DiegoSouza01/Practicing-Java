package NotificationSystem;

public class Email extends Notification {
    private String assunto;

    public Email(String destinatario, String corpo, String assunto) {
        super(destinatario, corpo);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Corpo: " + mensagem);
        System.out.println();
    }
}
