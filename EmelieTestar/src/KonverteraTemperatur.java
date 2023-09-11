import java.util.Scanner;
public class KonverteraTemperatur {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius: ");
        int temperature = scan.nextInt();

        int temperatureInFarenheit = (temperature * 9/5);

        System.out.println(temperature + " in Farenheit is: " + temperatureInFarenheit);

        scan.close();
    }
    
}

/*Övning 2: Konvertera temperatur
Skriv ett program som låter användaren mata in en temperatur i Celsius 
och sedan konverterar den till Fahrenheit med hjälp av följande formel: 
Fahrenheit = (Celsius * 9/5) + 32. Skriv sedan ut resultatet. */