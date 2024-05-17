import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       
        private static boolean tocando(){
            boolean atendeu = new Random().nextInt(3)==1;
            System.out.println("Atendeu? " + atendeu);
            return ! atendeu;
        }

    }
}
