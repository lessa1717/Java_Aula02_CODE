package EstruturaDecicao;

import java.util.Scanner;

public class condicional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor digite um número: ");
        int numero = sc.nextInt();

        if(numero >0){
            System.out.println("O numero digitado foi "+numero+" e é positivo");
        } else if (numero <0 ) {
            System.out.println("O numero digitado foi "+numero+" e  é negativo");

        }else{
            System.out.println("O numero digitado foi "+numero+" e  é neutro");
        }
    }
}
