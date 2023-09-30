package EstruturaDecicao;


import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));


        System.out.print("Por favor digite o salário: ");
        double salario = sc.nextDouble();
        if (salario < 1000){
            double salarioReajustado = salario * 1.1;
            System.out.printf("O salário é: %.2f%n",salarioReajustado);
        }else{
            System.out.printf("O salário sem reajuste é: %.2f%n",salario);
        }

        sc.close();
    }

}
