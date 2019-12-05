package predavanje3.control;

import javax.swing.JOptionPane;

public class StringSwitchDemo {

    public static void main(String[] args) {
        String imeDanaUSedmici = JOptionPane.showInputDialog("Unesi ime dana u sedmici");
        int brojDanaUSedmici = 0;
        switch (imeDanaUSedmici.toLowerCase()) {
            case "monday":
                brojDanaUSedmici = 1;
                break;
            case "tuesday":
                brojDanaUSedmici = 2;
                break;
            case "wednesday":
                brojDanaUSedmici = 3;
                break;
            case "thursday":
                brojDanaUSedmici = 4;
                break;
            case "friday":
                brojDanaUSedmici = 5;
                break;
            case "saturday":
                brojDanaUSedmici = 6;
                break;
            case "sunday":
                brojDanaUSedmici = 7;
                break;
            default:
                System.out.println("Invalidno ime dana u sedmici");
                break;
        }
        System.out.println("Za uneseno ime dana u sedmici " + imeDanaUSedmici + " Odgovara broj : " + brojDanaUSedmici);
    }
}
