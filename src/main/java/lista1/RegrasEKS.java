package main.java.lista1;
import java.util.Scanner;
import java.lang.Math;
public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;
        String msg1, msg2;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();


        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = (int) Math.ceil( numeroTotalPods / podsPorNode);






        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = (int) Math.ceil(numeroTotalPods / podsPorServidor);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.

        msg1 = (numeroMinimoNodes < 1 ) ? "Recomendamos usar um unico node" : "Numero minimo de nodes:" + numeroMinimoNodes;
        msg2 = (numeroMinimoServidores < 1 ) ? "Recomendamos usar um unico servidor" : "Numero minimo de servidores:" + numeroMinimoServidores;

        System.out.println(msg1);
        System.out.println(msg2);
        // Fechando o Scanner
        scanner.close();
    }
}
