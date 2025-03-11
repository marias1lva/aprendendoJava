package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco"); // Insere um novo elemento na posição 2

        System.out.println("Tamanho da lista: " + list.size()); // Imprime o tamanho da lista
        for (String x : list) { // Para cada string x na minha lista list, será impresso na tela o valor de x
            System.out.println(x);
        }
        System.out.println("----------------------------");

        list.remove("Anna"); // Remove um dado a partir da comparação de um valor com outro = REMOVE ANNA
        list.remove(1); // Remove um dado na posição desejada = REMOVE ALEX
        list.removeIf(x -> x.charAt(0) == 'M'); // Remove da lista aqueles elementos que atendem a um predicado (todos os elementos cuja primeira letra é 'M' = REMOVE MARIA E MARCO

        for (String x : list) {
            System.out.println(x); // Saída = Bob
        }
        System.out.println("----------------------------");

        list.add(0, "Alex");
        list.add(2, "Anna");

        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Imprime a posição do elemento pedido
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Se o elemento não está na lista, imprime -1
        System.out.println("----------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Filtra uma lista de strings e retorna apenas os elementos que começam com a letra 'A'
        for (String x : result) {
            System.out.println(x); // Saída = Alex Anna
        }
        System.out.println("----------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Acha o primeiro elemento com o predicado (acha o primeiro elemento que começa com a letra 'A')
        System.out.println(name);
        name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // Acha o primeiro elemento com o predicado (acha o primeiro elemento que começa com a letra 'J')
        System.out.println(name); // Saída = null (não tem nenhum nome que começa com J na lista)
    }
}

/* List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
   EXPLICAÇÃO:
   - list.stream(): converte a lista (list) em um Stream; (stream = sequência de elementos que permite realizar operações funcionais)
   - .filter(x -> x.charAt(0) == 'A'):
        - filter(Predicate<T>) é uma operação intermediária que seleciona elementos com base em uma condição;
        - o Predicate<T> (função lambda x -> x.charAt(0) == 'A') retorna true para strings que começam com 'A' e false para as outras;
        - o método charAt(0) obtém o primeiro caractere da string
   - .collect(Collectors.toList()):
        - o collect(Collectors.toList()) é uma operação terminal que converte o Stream<String> de volta para uma List<String>;
        - o resultado é uma nova lista contendo apenas os elementos filtrados
 */