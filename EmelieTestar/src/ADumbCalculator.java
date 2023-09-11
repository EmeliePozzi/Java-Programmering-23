import java.util.Scanner;
public class ADumbCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first number please:");
        double firstNumber = myScanner.nextDouble();

        System.out.println("Enter second number please:");
        double secondNumber = myScanner.nextDouble();

        System.out.println("Enter third number please:");
        double thirdNumber = myScanner.nextDouble();

        double equalsTo = (firstNumber+secondNumber+thirdNumber)/2;

        System.out.println("(" + firstNumber + " + " + secondNumber+  " + " +thirdNumber +")" + "/2 = " + equalsTo);

        myScanner.close();

        

        
    }
    
}
/*Make a simple numeric "calculator". It should prompt the user for three numbers. Then add the numbers together and divide by 2. Display the math problem and the result. Your program must support numbers with decimals and not just integers.

What is your first number? 1.1
What is your second number? 2.2
What is your third number? 5.5

( 1.1 + 2.2 + 5.5 ) / 2 is... 4.4 */