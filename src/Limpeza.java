public class Limpeza extends ServicoBase {

    private String tipoLimpeza;

    public Limpeza(int numSolicitacao, String cliente, String data, String tipoLimpeza) {
        super(numSolicitacao, cliente, data);
        this.tipoLimpeza = tipoLimpeza;
    }

    @Override
    public void executar() {
        super.validar();

        if (tipoLimpeza == null || tipoLimpeza.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é possível executar limpeza: tipo de limpeza não informado."); }

        System.out.println("Iniciando limpeza tipo '" + this.tipoLimpeza + "'.");

        System.out.println("Limpeza concluída para " + this.cliente + "'.");
    }
}