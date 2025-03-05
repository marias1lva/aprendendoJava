// Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).
// Escrever na tela o dia da semana correspondente.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.print("Digite o dia da semana: ");
        dia = sc.nextInt();

        switch(dia){
            case 1:
                System.out.println("Dia da semana: domingo");
                break;
            case 2:
                System.out.println("Dia da semana: segunda");
                break;
            case 3:
                System.out.println("Dia da semana: terca");
                break;
            case 4:
                System.out.println("Dia da semana: quarta");
                break;
            case 5:
                System.out.println("Dia da semana: quinta");
                break;
            case 6:
                System.out.println("Dia da semana: sexta");
                break;
            case 7:
                System.out.println("Dia da semana: sabado");
                break;
            default:
                System.out.println("Dia da semana: valor invalido");
                break;
        }
    }
}