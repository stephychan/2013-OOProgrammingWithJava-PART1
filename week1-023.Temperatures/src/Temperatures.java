
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        double number;
        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        
        while(true){
            System.out.println("Enter a temperature: ");
            number = Double.parseDouble(reader.nextLine());
            
            if((number >= -30) && (number <= 40)) {            
            Graph.addNumber(number);
            }
            
                
        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);

        }
    }
}