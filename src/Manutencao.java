public class Manutencao extends Servico {
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
}