package ExerciciosCondicional;

import java.util.Scanner;

public class ex04Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de usuário: ");

        String usuario = sc.nextLine();
        System.out.println("Digite o nome de usuário: ");


        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("senha123")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos");
        }
    }
}