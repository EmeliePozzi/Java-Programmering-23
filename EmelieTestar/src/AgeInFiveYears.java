import java.util.Scanner;
public class AgeInFiveYears {

    public static void main(String[] args) {
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Whats your name? ");
        String name = minScanner.nextLine();
        System.out.println("And how old are you  " + name + "?");
        int age = minScanner.nextInt();

        int ageInFiveyears = age + 5;
        int ageFiveyearsEarlier = age - 5;

        System.out.println("Did you know that in five years you will be " + ageInFiveyears + "  years old?");
         System.out.println("And five years ago you were " + ageFiveyearsEarlier + "! Imagine that!");

         minScanner.close();


        
    }
    
}

/*Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then display what their age would be five years from now. Then display what their age would be five years ago.

Hello.  What is your name? Percy_Bysshe_Shelley

Hi, Percy_Bysshe_Shelley!  How old are you? 34

Did you know that in five years you will be 39 years old?
And five years ago you were 29! Imagine that! */