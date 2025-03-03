import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;
        System.out.println("Digite a hora inicial do jogo: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        horaFinal = sc.nextInt();

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}