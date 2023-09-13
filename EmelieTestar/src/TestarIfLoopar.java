public class TestarIfLoopar {
    public static void main(String[] args) {

     //2.4 a Write a program that uses a for loop to print the numbers from 1 to 10, one number per line.

     for (int i = 1; i < 11; i++) {
        System.out.println(i);
     }

     //2.4 b Write a program that uses a while loop to count and print the even numbers from 2 to 20.
     int num = 2;
     while (num <= 20) {
         System.out.println(num);
         num += 2;
     }

     //2.4 c Write a program that uses a for loop to print the multiplication table of a given number (e.g., 5) up to 10 times.
     int multiTal = 9;
     for(int id = 0; id < 11; id++){
        System.out.println(multiTal + " * " + id + " = " + (multiTal * id));

     }

     

        
    }
}
