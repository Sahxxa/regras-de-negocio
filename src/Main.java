import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Instalacao i1 = new Instalacao(101, "Casa", "2025-11-10", "Roteador");
        Manutencao m1 = new Manutencao(102, "Hospital", "2025-11-11", "Servidor não liga");
        Vistoria v1 = new Vistoria(103, "Construção", "2025-11-12", "Relatório OK.");

        Limpeza l1 = new Limpeza(104, "Escritório", "2025-11-13", "Limpeza Pós-obra");

        // --- 2. Lista de Execução (Todos entram) ---
        List<Servico> servicos = new ArrayList<>();
        servicos.add(i1);
        servicos.add(m1);
        servicos.add(v1);
        servicos.add(l1);

        // ... adicione os casos de falha aqui se quiser testar validação ...
        //falhas
        servicos.add(new Instalacao(105, null, "2025-11-14", "Antena"));
        servicos.add(new Instalacao(106, "Loja", "2025-11-15", ""));
        servicos.add(new Vistoria(107, "Livraria", "2025-11-16", null));
        servicos.add(new Manutencao(108, "Oficina", "2025-11-17", " "));
        servicos.add(new Limpeza(109, "Cafeteria", "2025-11-18", null));


        Solicitacao processador = new Solicitacao();
        processador.processarServicos(servicos);



        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(i1);
        notificacoes.add(m1);
        notificacoes.add(v1); //vai enviar a mensagem da interface


        System.out.println("\n-------- NOTIFICAÇÕES --------");
        Notificador notificador = new Notificador();
        notificador.notificarServico(notificacoes);
    }
}