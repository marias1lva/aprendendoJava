package application;// A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
// Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão
// alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do
// estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
// um relatório de todas ocupações do pensionato.

import java.util.Scanner;
import java.text.ParseException;
import entities.Aluguel;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] vet = new Aluguel[10];

        int N;
        System.out.print("Quantos quartos serao alugados? ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String nome, email;
            int quarto;
            System.out.println("Aluguel " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Email: ");
            email = sc.next();
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            Aluguel aluguel = new Aluguel(nome, email);
            vet[quarto] = aluguel;
            System.out.println();
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if(vet[i] != null) {
                System.out.println(i + ": " + vet[i]);
            }
        }

        sc.close();
    }
}