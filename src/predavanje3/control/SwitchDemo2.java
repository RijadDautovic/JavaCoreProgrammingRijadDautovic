package predavanje3.control;

import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj mjeseca: ");
        int monthNumber = scanner.nextInt();
        System.out.println("Unesite i broj godine: ");
        int yearNumber = scanner.nextInt();
        int numberOfDaysInMonth = 0;
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDaysInMonth = 31;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDaysInMonth = 30;
                break;
            case 2:
                if ((yearNumber % 4 == 0 && !(yearNumber % 100 == 0)) || yearNumber % 400 == 0) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalidan unos broja mjeseca u godini");
                break;
        }
        System.out.println("Broj dana u mjesecu pod rednim brojem " + monthNumber + " u godini " + yearNumber + " je = " + numberOfDaysInMonth);
    }

}
