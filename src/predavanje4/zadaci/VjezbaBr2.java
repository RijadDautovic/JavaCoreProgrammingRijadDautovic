package predavanje4.zadaci;

import java.util.Arrays;

public class VjezbaBr2 {

    public static void main(String[] args) {
        int a[] = {1, 4, 3,};
        int b[] = {4, 5, 6,};

        int c[] = new int[a.length];
        Arrays.setAll(c, i -> a[i] + b[i]);
        System.out.println(Arrays.toString(c));
    }
}
