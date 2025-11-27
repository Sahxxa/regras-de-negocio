public class Instalacao extends ServicoBase implements Notificacao {
    private String equipamento;

    public Instalacao(int numSolicitacao, String cliente, String data, String equipamento) {
        super(numSolicitacao, cliente, data);
        this.equipamento = equipamento;
    }

    @Override
    public void executar() {
        super.validar();

        if (equipamento == null || equipamento.trim().isEmpty()) {
            throw new IllegalArgumentException("Equipamento não informado.");
        }

        System.out.println("Iniciando instalação do equipamento " + this.equipamento + ".");
        System.out.println("Instalação concluída para o cliente " + this.cliente+ ".");
    }

    //adição da interface do lab com override
    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("Novo E-mail para " + this.cliente + ": " + mensagem);

    }
}