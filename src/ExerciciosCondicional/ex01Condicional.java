package ExerciciosCondicional;

import java.util.Scanner;

public class ex01Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double segundaNota = sc.nextDouble();



        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 6) {
            System.out.println("Meus parabéns!");

        } else {
            System.out.println("Você não passou. Estude um pouco mais!");

        }
    }
}
