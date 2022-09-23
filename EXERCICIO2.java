import java.util.Scanner;

public class EXERCICIO2 {
    //Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estão abaixo da
    //diagonal principal.

    public static void main(String[] args) {
        int[][] num = new int[3][3];
        int soma=0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.println("Escreva o numero da linha " + (i + 1) + ", coluna " + (j+1));
                num[i][j] = scanner.nextInt();
                if ((i==1 && j==0) || (i==2 && j==0) || (i==2 && j==1) ) {
                    soma = soma + num[i][j];
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("");
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " - ");

            }
        }
        System.out.println("");
        System.out.println("A a soma dos elementos que estão abaixo da diagonal principal -> "+soma);
    }
}