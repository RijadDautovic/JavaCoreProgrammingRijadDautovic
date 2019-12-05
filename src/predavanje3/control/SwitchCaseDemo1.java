package predavanje3.control;

import java.util.ArrayList;
import java.util.Scanner;

public class SwitchCaseDemo1 {

    public static void main(String[] args) {
        ArrayList<String> mjeseciUGodini = new ArrayList<>();
        System.out.println("Unesi, molim te, broj mjeseca");
        int month = new Scanner(System.in).nextInt();
        switch (month) {
            case 1:
                mjeseciUGodini.add("Januar");
            case 2:
                mjeseciUGodini.add("Februar");
            case 3:
                mjeseciUGodini.add("Mart");
            case 4:
                mjeseciUGodini.add("April");
            case 5:
                mjeseciUGodini.add("Maj");
            case 6:
                mjeseciUGodini.add("Juni");
            case 7:
                mjeseciUGodini.add("Juli");
            case 8:
                mjeseciUGodini.add("Avgust");
            case 9:
                mjeseciUGodini.add("Septembar");
            case 10:
                mjeseciUGodini.add("Oktobar");
            case 11:
                mjeseciUGodini.add("Novembar");
            case 12:
                mjeseciUGodini.add("Decembar");
                break;
            default:
                break;

        }
        if (mjeseciUGodini.isEmpty()) {
            System.out.println("Netačan broj mjeseci u godini. Godina ima 12 mjeseci.");
        } else{
            for ( String mjesec: mjeseciUGodini){
                System.out.println(mjesec);
    }
}
}
}
