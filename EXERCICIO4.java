import java.util.Random;
import java.util.Scanner;

public class EXERCICIO4 {
//   Faça um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes
//informações sobre alunos de uma disciplina, sendo todas as informações do tipo inteiro:
//• Primeira coluna: número de matrícula (use um inteiro):
//• Segunda coluna: média das provas:
//• Terceira coluna: média dos trabalhos:
//• Quarta coluna: nota final elabore um programa que:
//(a) Leia as três primeiras informações de cada aluno;
//(b) Calcule a nota final como sendo a soma da média das provas e da média dos trabalhos;
//(c) Imprima a matrícula do aluno que obteve a maior nota final (assume que só existe uma maior
//nota);
//(d) Imprima a média aritmética das notas finais

    public static void main(String[] args) {
        int[][] num = new int[5][4];
        int matricula, mediaP, mediaT, notaFinal,maiorNota=0,maiorMatricula=0, mediaA=0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("");
            for (int j = 0; j < num.length; j++) {
                if (j == 0) {
                    System.out.print("Informe o numero da matricula do " + (i + 1) + " aluno: ");
                    matricula = scanner.nextInt();
                    num[i][j] = matricula;
                    System.out.println("");
                }
                if (j == 1) {
                    System.out.print("Informe a media das provas do " + (i + 1) + " aluno: ");
                    mediaP = scanner.nextInt();
                    num[i][j]= mediaP;
                }else if (j == 2) {
                    System.out.print("Informe a media dos trabalhos do " + (i + 1) + " aluno: ");
                    mediaT = scanner.nextInt();
                    num[i][j]= mediaT;
                }else if (j == 3) {
                    notaFinal= (num[i][1] + num[i][2]);
                    num[i][j]= notaFinal;
                    System.out.println("A nota final do "+(i+1)+" aluno e :"+notaFinal);
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            mediaA= mediaA + num[i][3];
            if (num[i][3]>maiorNota){
                maiorNota=num[i][3];
                maiorMatricula = num[i][0];
            }

        }
        System.out.println("a maior nota foi "+maiorNota+", do aluno "+maiorMatricula);
        System.out.println("a media das notas finais e de "+(mediaA/5));
    }
}
