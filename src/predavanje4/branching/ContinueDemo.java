package predavanje4.branching;

import java.util.Scanner;

public class ContinueDemo {

    public static void main(String[] args) {
        System.out.println("Unesi rečenicu");
        String recenica = new Scanner(System.in).nextLine();
        char[] stringJeNizKaraktera = recenica.toCharArray();
        char searchForChar = 's';
        int counterP = 0;
        for (char c : stringJeNizKaraktera) {
            if (c != searchForChar) {
                continue;
            }
            counterP++;
        }
        System.out.println("Slovo 's' se pojavljuje " + counterP + " puta u rečenici");
    }
}
