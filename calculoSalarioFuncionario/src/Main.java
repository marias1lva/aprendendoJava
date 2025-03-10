// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e
// calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        System.out.print("Informe o numero do funcionario: ");
        numero = sc.nextInt();
        System.out.print("Informe o numero de horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.print("Informe o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMERO = " + numero);
        System.out.printf("SALARIO = R$%.2f", salario);
    }
}