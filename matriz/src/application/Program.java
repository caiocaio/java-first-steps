package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m ; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Qual numero vc quer investigar? ");
        int x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Número " + x + " encontrado na posição (" + i + ", " + j + "):");

                    // Verifica o elemento à esquerda
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }

                    // Verifica o elemento à direita
                    if (j < n - 1) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }

                    // Verifica o elemento acima
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }

                    // Verifica o elemento abaixo
                    if (i < m - 1) {
                        System.out.println("Abaixo: " + mat[i + 1][j]);
                    }
                }
            }
        }

    }
}
