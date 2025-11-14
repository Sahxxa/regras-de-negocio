import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Servico> listaDeServicos = new ArrayList<>();

        listaDeServicos.add(new Instalacao(101, "Casa", "2025-11-10", "Roteador"));
        listaDeServicos.add(new Manutencao(102, "Hospital", "2025-11-11", "Servidor não liga"));
        listaDeServicos.add(new Vistoria(103, "Construção", "2025-11-12", "Relatório de vistoria de segurança OK."));
        //limpeza add
        listaDeServicos.add(new Limpeza(104, "Escritório", "2025-11-13", "Limpeza Pós-obra"));

        //falhas
        listaDeServicos.add(new Instalacao(105, null, "2025-11-14", "Antena"));
        listaDeServicos.add(new Instalacao(106, "Loja", "2025-11-15", ""));
        listaDeServicos.add(new Vistoria(107, "Livraria", "2025-11-16", null));
        listaDeServicos.add(new Manutencao(108, "Oficina", "2025-11-17", "  "));
        listaDeServicos.add(new Limpeza(109, "Cafeteria", "2025-11-18", null));


        Solicitacao processador = new Solicitacao();
        processador.processarServicos(listaDeServicos);
    }
}