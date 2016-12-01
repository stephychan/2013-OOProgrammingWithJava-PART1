
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String user = reader.nextLine();
        System.out.println("Type your username: ");
        
        String passw = reader.nextLine();
        System.out.println("Type your password: ");


        if (user.equals("alex") && passw.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
            
        } else if (user.equals("emily") && passw.equals("cat")) {
            System.out.println("You are now logged into the system!");
        
        } else {
            System.out.println("Your username or password was invalid!"); 
        }     
    }
}


    

