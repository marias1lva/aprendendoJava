// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
// (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo
// código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de
// clientes que abasteceram cada tipo de combustível.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, alcool = 0, gasolina = 0, diesel = 0;

        System.out.print("Digite o codigo: ");
        codigo = sc.nextInt();
        while (codigo != 4) {
            if(codigo == 1) {
                alcool++;
                System.out.print("Digite o codigo: ");
                codigo = sc.nextInt();
            }else if(codigo == 2) {
                gasolina++;
                System.out.print("Digite o codigo: ");
                codigo = sc.nextInt();
            }else if(codigo == 3) {
                diesel++;
                System.out.print("Digite o codigo: ");
                codigo = sc.nextInt();
            }else{
                System.out.println("Codigo invalido!");
                System.out.print("Digite o codigo: ");
                codigo = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}