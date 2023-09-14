import java.util.Scanner;
public class PositivtNegativtEllerNoll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("Your number is a positive number");
        }
        else if (number < 0) {
            System.out.println("Your number is negative");
        }
        else {
            System.out.println("Your number is zero");
        }

        scan.close();
        
    }
    
}

/*1. Skriv ett Java-program som tar emot ett nummer från användaren och skriver ut i
terminalen om det är positivt, negativt eller noll.
 */