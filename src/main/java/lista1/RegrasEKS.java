package main.java.lista1;
import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();


        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = numeroTotalPods / podsPorNode;


        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = numeroTotalPods / podsPorServidor;

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.


        // Fechando o Scanner
        scanner.close();
    }
}
