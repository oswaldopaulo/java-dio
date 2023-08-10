package main.java.lista1;
import java.util.Scanner;
import java.lang.Math;
public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        double podsPorNode = 10;
        double podsPorServidor = 4;
        String msg1, msg2;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        double numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
        double numeroMinimoNodes =   numeroTotalPods / podsPorNode;
        //TODO: Calcule o número mínimo de servidores necessários
        double numeroMinimoServidores =  numeroTotalPods / podsPorServidor;

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.


        msg1 = (numeroMinimoNodes <= 1 ) ? "Recomendamos usar um unico node" : "Numero minimo de nodes:" + (int) Math.ceil(numeroMinimoNodes);
        msg2 = (numeroMinimoServidores <= 1 ) ? "Recomendamos usar um unico servidor" : "Numero minimo de servidores:" + (int) Math.ceil(numeroMinimoServidores);

        System.out.println("1." + msg1);
        System.out.println("2."+ msg2);
        // Fechando o Scanner
        scanner.close();
    }
}
