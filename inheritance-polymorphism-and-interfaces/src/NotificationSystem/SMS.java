package NotificationSystem;

public class SMS extends Notification {

    public SMS(String numeroTelefone, String mensagem) {
        super(numeroTelefone, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println();
    }
}
