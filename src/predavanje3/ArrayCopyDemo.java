package predavanje3;

import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 'f', 'r'};
        char[] copyToArray = Arrays.copyOfRange(copyFrom, 2,10); 
        System.out.println(new String(copyToArray));

    }
}
