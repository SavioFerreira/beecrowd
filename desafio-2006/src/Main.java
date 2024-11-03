import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner sc = new Scanner(System.in);
        int valorCorreto = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<Integer> entradas = new ArrayList<>(Arrays.asList(A, B, C, D, E));
        int acertos = 0;
        for (Integer entrada : entradas) {
            if (entrada.equals(valorCorreto)) {
                acertos++;
            }
        }
        System.out.println(acertos);
    }
}