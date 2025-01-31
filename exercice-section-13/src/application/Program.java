package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();


        List<Pessoa> list = new ArrayList<>();

        for (int i = 1; i < n ; i++) {
            System.out.println("Tax payer #" + i + "data:");
            System.out.print("Individual or Company? (i/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }else {
                System.out.print("Number of employess");
                int numeroFunc = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, numeroFunc));
            }
        }

        System.out.println();
        System.out.println("Taxes Paid: ");
        for (Pessoa pessoa : list){
            System.out.println(pessoa.getNome() + " $ ");
        }

    }
}
