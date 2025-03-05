// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar
// a mensagem "divisao impossivel".

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.print("Digite a quantidade de valores: ");
        N = sc.nextInt();
        double n1, n2, divisao;
        System.out.println("Digite os valores: ");

        for(int i = 0; i < N; i++){
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            if(n2 == 0){
                System.out.println("divisao impossivel");
            }else{
                divisao = n1 / n2;
                System.out.printf("Divisao = %.1f%n", divisao);
            }
        }

        sc.close();
    }
}