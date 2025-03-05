// Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        while(numero != 0){
            int i = 0;
            soma += numero;
            System.out.print("Digite outro numero: ");
            numero = sc.nextInt();
            i++;
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}