public abstract class ServicoBase implements Servico {

    protected int numSolicitacao;
    protected String cliente;
    protected String data;

    public ServicoBase(int numSolicitacao, String cliente, String data) {
        this.numSolicitacao = numSolicitacao;
        this.cliente = cliente;
        this.data = data;
    }

    @Override
    public final void validar() {
        if (cliente == null || cliente.trim().isEmpty()) {
            throw new IllegalArgumentException("É necessário informar o nome do cliente.");
        }
    }

    @Override
    public abstract void executar();

    @Override
    public final void exibirResumo() {
        System.out.println("\n-----RESUMO-----");
        System.out.println("-Serviço: " + this.getClass().getSimpleName());
        System.out.println("-Número: " + this.numSolicitacao);
        System.out.println("-Cliente: " + this.cliente);
        System.out.println("-Data: " + this.data);
    }

    public int getNumSolicitacao() {
        return numSolicitacao;
    }
}