import java.util.List;

public class Notificador {

    public void notificarServico(List<Notificacao> listaDeNotificacoes){
        for (Notificacao n: listaDeNotificacoes){
            n.enviarNotificacao("Notificação enviada com sucesso.");
        }
    }
}
