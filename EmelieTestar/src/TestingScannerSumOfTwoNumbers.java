import java.util.Scanner;
public class TestingScannerSumOfTwoNumbers {


    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the first number");
        int number1 = scan.nextInt();
        System.out.println("Enter second number");
        int number2 = scan.nextInt();
        int twoNumbers = number1+number2;

        System.out.println("The two numbers togheter equals " + twoNumbers);
    
        scan.close();
    }
}


/*Övning 1: Summera två tal
Skriv ett Java-program som läser in två heltal från användaren med hjälp av Scanner, summerar dem och skriver ut resultatet. */