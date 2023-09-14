import java.util.Scanner;
public class VilketNummerArStorst {
    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber>secondNumber&& firstNumber>thirdNumber){
            System.out.println("Det största talet du matade in var " + firstNumber);

        }
        else if (secondNumber>firstNumber&& secondNumber>thirdNumber){
            System.out.println("Det största talet du matade in var " + secondNumber);
        }
        else if (thirdNumber>firstNumber && thirdNumber> secondNumber) {
            System.out.println("Det största talet du matade in var " + thirdNumber);
        }
        scan.close();
    }
    
}

/*. Skriv ett Java-program som tar emot tre nummer från användaren och skriver ut vilket som
är störst.
 */