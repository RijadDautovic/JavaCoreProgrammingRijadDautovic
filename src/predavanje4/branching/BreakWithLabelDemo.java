package predavanje4.branching;

import java.util.Scanner;

public class BreakWithLabelDemo {

    public static void main(String[] args) {
        System.out.println("Unesite neki broj: ");
        int searchFor = new Scanner(System.in).nextInt();
        int[][] numbers = {
            {32, 87, 3, 589},
            {12, 34, 56, 7, 8, 8},
            {67, 69, 16, 6, 54, 8}
        };
        rijad:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int vrijednost = numbers[i][j];
                System.out.println(vrijednost + " ");
                if (searchFor == vrijednost) {

                    break rijad;

                }
            }

        }
    }
}
