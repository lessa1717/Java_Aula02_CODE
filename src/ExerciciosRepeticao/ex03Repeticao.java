package ExerciciosRepeticao;

import java.util.Scanner;

public class ex03Repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
        } while (numero != 0);
    }
}
