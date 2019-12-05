
package predavanje3;

import java.util.Scanner;

public class ConsoleReadDemo {
    public static void main(String[] args) {
        System.out.println("Molimo vas unesite neki broj: ");
        Scanner scanner = new Scanner(System.in);
        int uneseniBroj = scanner.nextInt();
        System.out.println("Unešeni broj je broj: " + uneseniBroj);
        
    }
}
