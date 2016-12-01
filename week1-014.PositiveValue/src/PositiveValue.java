
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Enter a number: ");
        
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else {        
        System.out.println("The number is not positive.");
    }
}
}
