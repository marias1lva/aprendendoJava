// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite um valor inteiro: ");
        x = sc.nextInt();

        if(x >= 0){
            System.out.println("NAO NEGATIVO");
        }else{
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}