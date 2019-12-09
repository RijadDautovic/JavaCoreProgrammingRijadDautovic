package predavanje4.branching;

import java.util.Scanner;

public class BreakDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, ','};
        int searchFor = new Scanner(System.in).nextInt();
        int i;
        boolean pronadjen = false;
        for (i = 0; i < numbers.length; i++) {
            int mutant = numbers[i];
            if (mutant == searchFor) {
                pronadjen = true;
                break;
            }

        }
        if (pronadjen) {
            System.out.println("Pronađen" + searchFor + " na indeksu : " + i + " ");

        } else {
            System.out.println("Nema tog broja: " + searchFor);
        }

    }
}
