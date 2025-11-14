public class Vistoria extends Servico {
    private String relatorio;

    public Vistoria(int numSolicitacao, String cliente, String data, String relatorio) {
        super(numSolicitacao, cliente, data);
        this.relatorio = relatorio;
    }
    @Override
    public void executar() {
        super.validar();

        if (relatorio == null || relatorio.trim().isEmpty()) {
            throw new IllegalArgumentException("O relatório obrigatório não foi gerado.");
        }

        System.out.println("Realizando vistoria.");
        System.out.println("Vistoria concluída para o cliente " + this.cliente + ".");
    }
}