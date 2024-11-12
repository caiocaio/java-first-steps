package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?" );
        int p = sc.nextInt();

        String[] nomes = new String[p];
        int[] idades = new int[p];
        double[] alturas = new double[p];

        for (int i = 0; i < p; i++){
            System.out.println("Dados da " + (i+1)+ "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            }

        double soma = 0.0;

        for (int i = 0; i < p; i++){
           soma = soma + alturas[i];

        }
        double mediaAlturas = soma / p;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int cont = 0;
        for (int i = 0; i < p; i++){
            if(idades[i]< 16){
                cont = cont +1;
            }
        }

        double percent = cont * 100.0 / p;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < p; i++){
           if (idades[i] < 16){
               System.out.println(nomes[i]);
           }

        }

    }
}
