package predavanje4.zadaci;

import java.util.Random;

public class VjezbaBr1 {

    public static void main(String[] args) {
        String[][] vjezba = {
            {"Heart"},
            {"Cherry"},
            {"Coin"},
            {"Melon"},
            {"Jocker"}
        };
        kombinacija:
        for (int i = 0; i < vjezba.length; i++) {
            for (int j = 0; i < vjezba[i].length; j++) {
                String kombinacija = vjezba[i][j];
                System.out.println(kombinacija);

            }
        }

    }
}
