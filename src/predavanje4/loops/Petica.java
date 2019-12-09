package predavanje4.loops;

import java.util.Scanner;

public class Petica {

    public static void main(String[] args) {
        System.out.println("Pritisni peticu započni igricu!");
        Scanner scanner = new Scanner(System.in);
        int uneseniBroj = scanner.nextInt();
        while (uneseniBroj != 5) {
            System.out.println("To nije petica! Pritisni peticu započni igricu");
            uneseniBroj = scanner.nextInt();
            System.out.println("Igrica može da počne");
        }

    }

}
