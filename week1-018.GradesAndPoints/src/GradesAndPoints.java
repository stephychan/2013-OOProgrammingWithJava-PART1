
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
        int i = Integer.parseInt(reader.nextLine());
        System.out.println("Type the points [0-60]: ");
        
        if (i <= 29) {
            System.out.println("Grade: failed");
        } else if (i <= 34){
            System.out.println("Grade: 1");
        } else if (i <= 39){
            System.out.println("Grade: 2");
        } else if (i <= 44){
            System.out.println("Grade: 3");
        } else if (i <= 49){
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }
    }
}
