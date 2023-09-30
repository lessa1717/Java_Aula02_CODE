package ExerciciosCondicional;

import java.util.Scanner;

public class ex02Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é positivo ou negativo:");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("neutro");
        }
    }
}
