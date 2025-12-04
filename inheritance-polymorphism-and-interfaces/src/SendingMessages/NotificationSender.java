package SendingMessages;

public class NotificationSender {

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String contato, String mensagem) {
        System.out.println("Mensagem para " + contato + ": " + mensagem);
    }

    public void enviarMensagem(String contato, String mensagem, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println("Mensagem para " + contato + ": " + mensagem);
        }
    }
}