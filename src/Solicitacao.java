import java.util.List;

public class Solicitacao {

    public void processarServicos(List<Servico> servicos) {

        for (Servico s : servicos) {
            try {
                s.executar();
                s.exibirResumo();
            }
            catch (IllegalArgumentException e) {
                System.err.println("FALHA AO PROCESSAR SERVIÇO:" + e.getMessage());
                s.exibirResumo();
            }
            catch (Exception e) {
                System.err.println("ERRO GENÉRICO: " + e.getMessage());
            }
            System.out.println("-----------------------------------------------------");
        }
    }
}