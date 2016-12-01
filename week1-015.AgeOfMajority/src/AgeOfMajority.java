
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int age = Integer.parseInt(reader.nextLine());
        System.out.println("How old are you?");
        
        if (age < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
            }
        }
}
