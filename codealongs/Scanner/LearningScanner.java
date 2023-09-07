package codealongs.Scanner;
import java.util.Scanner;


public class LearningScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Please input a number");
        myNumber = scanner.nextInt();



        System.out.println("Your number is: " + myNumber);
        
        scanner.close();


        
    }
    
}
