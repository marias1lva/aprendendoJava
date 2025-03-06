// Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
// valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
// quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter student name: ");
        student.name = sc.nextLine();
        System.out.print("Enter first grade: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Enter second grade: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Enter third grade: ");
        student.grade3 = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
        if(student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING POINTS = %.2f%n", student.missingPoints());
        }else{
            System.out.println("PASS");
        }

        sc.close();
    }
}