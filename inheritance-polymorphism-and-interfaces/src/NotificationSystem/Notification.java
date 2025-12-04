package NotificationSystem;

public class Notification {
    protected String destinatario;
    protected String mensagem;

    public Notification(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void enviar() {
        System.out.println("Enviando notificação genérica...");
    }
}
