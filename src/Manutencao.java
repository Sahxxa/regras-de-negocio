public class Manutencao extends ServicoBase implements Notificacao{
    private String descricaoDefeito;
    private boolean concluido;

    public Manutencao(int numSolicitacao, String cliente, String data, String descricaoDefeito) {
        super(numSolicitacao, cliente, data);
        this.descricaoDefeito = descricaoDefeito;
        this.concluido = false;
    }

    @Override
    public void executar() {
        super.validar();
        if (descricaoDefeito == null || descricaoDefeito.trim().isEmpty()) {
            throw new IllegalArgumentException("Dfeito não informado. Impossível realizar manutenção");
        }

        System.out.println("Iniciando manutenção do defeito " + this.descricaoDefeito +".");
        this.concluido = true;
        System.out.println("Manutenção concluída. Status: " + (this.concluido ? "Concluído" : "Pendente"));
    }

    //adição da interface do lab com override
    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("SMS enviado para " + this.cliente + ": " + mensagem);

    }
}