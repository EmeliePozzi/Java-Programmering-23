import java.util.Scanner;
public class DoWhileLosenord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;

        do {
            System.out.println("Enter secret password please: ");
            password = scan.nextLine();


        } while (!password.equals("hemligt"));
        scan.close();
    }
    
    
    
}
