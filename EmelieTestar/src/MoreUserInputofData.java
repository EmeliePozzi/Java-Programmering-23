import java.util.Scanner;
public class MoreUserInputofData {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = myScanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = myScanner.nextLine();

        System.out.println("Enter your grade:");
        String grade = myScanner.nextLine();

        System.out.println("Enter your student id-number:");
        int idnumber = myScanner.nextInt();
        myScanner.nextLine();
        

        System.out.println("Enter your login name:");
        String loginName = myScanner.nextLine();

        System.out.println("Enter your GPA (0.0 to 4.0:)");
        double gpa = myScanner.nextDouble();

        System.out.println("This is your information: ");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Grade: " + grade);
        System.out.println("Student id number: " + idnumber);
        System.out.println("Log in name: " + loginName);
        System.out.println("GPA: " + gpa);

        myScanner.close();
        


        
    }
}

/*Ask the user for several pieces of information, and display them on the screen afterward as a summary.

first name
last name
grade (classification)
student id number
login name
GPA (0.0 to 4.0)
You must use the most appropriate type for each variable and not just Strings for everything. */