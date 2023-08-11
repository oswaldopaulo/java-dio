package main.java.lista1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        List<String> servicos = new ArrayList<>();

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
          //  String servico = parts[1];

            servicos.add(parts[1]);

            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
        }



        System.out.println();

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
    }
}

