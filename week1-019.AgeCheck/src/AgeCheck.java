
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = Integer.parseInt(reader.nextLine());
        System.out.println("How old are you? ");
        
        if (i < 0) {
            System.out.println("Impossible!");
        } else if (i > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
    }
  }
}