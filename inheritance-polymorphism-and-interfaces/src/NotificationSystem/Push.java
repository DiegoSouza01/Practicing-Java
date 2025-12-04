package NotificationSystem;

public class Push extends Notification {
    private String titulo;

    public Push(String usuarioApp, String conteudo, String titulo) {
        super(usuarioApp, conteudo);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push para: " + destinatario);
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + mensagem);
        System.out.println();
    }
}
