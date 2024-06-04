import java.util.*;
public class RockPaperScissor {

    public static void main(String[] args) {
        Random x = new Random();
        int Numero = x.nextInt(3);
        if (Numero == 0) {
            System.out.println("Pedra");
        }
        if (Numero == 1) {
            System.out.println("Papel");
        }
        if (Numero == 2) {
            System.out.println("Tesoura");
        }

    }
}
