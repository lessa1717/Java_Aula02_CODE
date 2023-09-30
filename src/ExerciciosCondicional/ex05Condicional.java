package ExerciciosCondicional;

import java.util.Scanner;

public class ex05Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite sua idade: ");
        int idade = sc.nextInt();

        String mensagem = (idade >= 18) ? "Você é maior de idade" : ((idade > 0) ? "Você é menor de idade" : "O valor digitado é inválido");
        System.out.println(mensagem);
    }
}