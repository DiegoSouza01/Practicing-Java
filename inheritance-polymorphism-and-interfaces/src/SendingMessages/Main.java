package SendingMessages;

public class Main {
    public static void main(String[] args) {
        NotificationSender notificacao = new NotificationSender();

        notificacao.enviarMensagem("Olá!");

        notificacao.enviarMensagem("João", "Bom dia!");

        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
