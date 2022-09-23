import java.util.Random;
import java.util.Scanner;

public class EXERCICIO3 {
// Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela de
//bingo. Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere estes dados  ́ de
//modo a não ter númerosrepetidos dentro das cartelas. O programa deve exibir na  ́ tela a cartela
//gerada.

    public static void main(String[] args) {
        int[][] num = new int[5][5];
        int numero, cont = 0;
        Random rand = new Random();

        for (int i = 0; i < num.length; i++) {
            System.out.println("");
            for (int j = 0; j < num.length; j++) {
                do{
                numero = rand.nextInt(99);
                cont=0;
                for (int k = 0; k < num.length; k++) {
                    for (int l = 0; l < num.length; l++) {
                        if (numero == num[k][l]) {
                            cont = cont + 1;
                        }
                    }
                }
                if(cont==0){
                   num[i][j] = numero;
                }

                }while (cont!=0);
                System.out.print(num[i][j]+" - ");
            }
        }
    }
}
