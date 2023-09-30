package ExerciciosRepeticao;
import java.util.ArrayList;
import java.util.List;

public class ex05Repeticao {

        public static void main(String[] args) {
            List<String> listaDeCarros = new ArrayList<>();
            listaDeCarros.add("fiesta");
            listaDeCarros.add("onix");
            listaDeCarros.add("fusca");
            listaDeCarros.add("saveiro");

            for (String carro : listaDeCarros) {
                System.out.println("O carro atual é: " + carro);
            }
        }
    }

