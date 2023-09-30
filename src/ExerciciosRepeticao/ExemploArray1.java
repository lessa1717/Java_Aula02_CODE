package ExerciciosRepeticao;

public class ExemploArray1 {
    public static void main(String[] args) throws InterruptedException {
        String[] listaCarros = {"SP2", "Maverik","Fusca", "GT40"};

        for (String cadCarro : listaCarros){
            System.out.println(cadCarro);
            Thread.sleep(1000);
        }
    }
}
