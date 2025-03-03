// Uma operadora de telefonia cobra R$50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a
// franquia de 100 minutos custa R$2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, e mostrar o
// valor total a ser pago.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double conta = 50.0;
        System.out.print("Informe quantos minutos: ");
        minutos = sc.nextInt();
        if(minutos > 100){
            conta += (minutos - 100) * 2.0; // minutos - 100 calcula os minutos excedentes
        }

        System.out.printf("Valor da conta: R$%.2f", conta);

        sc.close();
    }
}