import java.util.Scanner;
public class TarEmotDecimalaTal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input;
        System.out.println("Enter number: ");
        input = scan.nextDouble();
        if (input == 0.0) {
            System.out.println("0");
        }
        else if (input > 0){
            System.out.println("Positivt tal!");
            if (input < 1){
                System.out.println("Litet");
            }
                else if (input > 1000000) {
                   System.out.println("Stort!"); 
                
                }
        }
        else if (input < 0) {
            System.out.println("Negativt tal!");
        }

        System.out.println(input);
        
    }

    
}
/*Skriv ett Java-program som tar emot decimala tal (float/double) och skriver ut: 
“0” – om talet är noll.
 “Positivt” - Om talet är positivt 
 “Negativt” - Om talet är negativt. 
 Ytterligare skall programmet lägga till: “Litet” - Om talet är mindre än 1. 
 “Stort” - Om talet är större än 1 000 000. */