package predavanje3.control;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        System.out.println("Unesite poene za ocjenu:");
        Scanner profinScanner = new Scanner(System.in);
        int testScore = profinScanner.nextInt();
        char grade;
        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else {
            System.out.println("Pali ste ispit");
        }

    }
}
