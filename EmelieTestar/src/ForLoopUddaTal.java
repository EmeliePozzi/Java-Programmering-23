public class ForLoopUddaTal {
public static void main(String[] args) {

    
    for (int i = 1; i <= 10; i+= 2) {
        System.out.println(i);
    }

    int n = 5; // Antal rader i mönstret (ändra efter behov)

    // Yttre loop för att hantera rader
    for (int i = 1; i <= n; i++) {
        // Inre loop för att skriva ut asterisker i varje rad
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Gå till nästa rad
        System.out.println();
    }
    
}

}