import java.util.Objects;

abstract class Servico {
    protected int numSolicitacao;
    protected String cliente;
    protected String data;

    public Servico(int numSolicitacao, String cliente, String data) {
        this.numSolicitacao = numSolicitacao;
        this.cliente = cliente;
        this.data = data;
    }
    public final void validar() {
        if (cliente == null || cliente.trim().isEmpty()) {
            throw new IllegalArgumentException("É necessário informar o nome do cliente."); }
    }

    public abstract void executar();

    public final void exibirResumo() {
        System.out.println("\n-----RESUMO-----");
        System.out.println("-Serviço: " + this.getClass().getSimpleName()); //
        System.out.println("-Número: " + this.numSolicitacao);
        System.out.println("-Cliente: " + this.cliente);
        System.out.println("-Data: " + this.data);
    }

    public int numSolicitacao(){
        return numSolicitacao;
    }
}
