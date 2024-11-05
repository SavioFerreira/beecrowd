import java.util.Scanner;

public class Main {

    /*
    João fez uma pesquisa em seu site de busca predileto, e encontrou a resposta que
    estava procurando no terceiro link listado. Além disso, ele viu, pelo site,
    que t pessoas já haviam clicado neste link antes. João havia lido anteriormente,
    também na Internet, que o número de pessoas que clicam no segundo link listado é o
    dobro de número de pessoas que clicam no terceiro link listado. Nessa leitura,
    ele também descobriu que o número de pessoas que clicam no segundo link é a metade
    do número de pessoas que clicam no primeiro link.

    Exemplos de Entrada 	Exemplos de Saída
            2                       8

           25                      100
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() * 4);
    }

}
