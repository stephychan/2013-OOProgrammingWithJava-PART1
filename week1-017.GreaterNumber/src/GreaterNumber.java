import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the first number: ");
        
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        
        if (number1 < number2) {
            System.out.println("Greater number: " + number2);
        } else if (number1 > number2){
            System.out.println("Smaller number: " + number1);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
