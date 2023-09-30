package ExerciciosRepeticao;

import java.util.Scanner;

public class ex02Repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;

        do {
            System.out.println("Digite sua senha: ");
            senha = sc.nextLine();

            if (!senha.equals(("123"))){
                System.out.println("Senha incorreta!");
            }
        }while (!senha.equals("123"));

    }
}
