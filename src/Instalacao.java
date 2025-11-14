public class Instalacao extends Servico {
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
}