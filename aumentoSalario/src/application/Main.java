// Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
// Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir,
// mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários.
// Aplicar técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
// aumento por porcentagem dada.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        int n;
        System.out.print("How many employees will be registered? ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int id;
            String name;
            System.out.println();
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            id = sc.nextInt();
            while(hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: $");
            double salary;
            salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        int id;
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist.");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage;
            percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}