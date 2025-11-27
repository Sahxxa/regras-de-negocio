public interface Notificacao {
    default void enviarNotificacao(String mensagem) {
        System.out.println("Notificação SMS para o cliente: " + mensagem);
    }
}
