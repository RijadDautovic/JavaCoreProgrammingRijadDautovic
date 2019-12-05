package predavanje3.control;
// Za proste tipove podataka postoje njihovi omotaci.

import javax.swing.JOptionPane;

public class SwitchDemo {

    public static void main(String[] args) {
        int number = 2;
        String korisnickiUnos = JOptionPane.showInputDialog("Unesite broj:");
        int uneseniBroj = Integer.parseInt(korisnickiUnos);
        String imeMjeseca = " Unkown ";
        switch (uneseniBroj) {
            case 1:
                imeMjeseca = "Januar";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 2:
                imeMjeseca = "Februar";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 3:
                imeMjeseca = "Mart";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 4:
                imeMjeseca = "April";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 5:
                imeMjeseca = "Maj";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 6: 
                imeMjeseca = "Juni";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 7:
                imeMjeseca = "Juli";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 8:
                imeMjeseca = "Avgust";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 9:
                imeMjeseca = "Septembar";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 10:
                imeMjeseca = "Oktobar";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 11:
                imeMjeseca = "Novembar";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            case 12:
                imeMjeseca = "Decembar";
                break; // Break nas izbaci iz kompletne switch konstrukcije
            default:
                imeMjeseca = "Postoji samo 12 mjeseci u jednoj godini";
                break;
        }
        System.out.println("Mjesec koji je "  + uneseniBroj + ". po redu u godini je: " +  imeMjeseca);
    }

}
