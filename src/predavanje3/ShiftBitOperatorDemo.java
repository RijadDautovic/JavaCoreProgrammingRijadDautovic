package predavanje3;

public class ShiftBitOperatorDemo {

    public static void main(String[] args) {
        int a = 10;
        int result = a >> 1;
        //dijeljenje sa 2 , signed shift right
        System.out.println(result);
        int result1 = a >>> 1;
        // unsigned shif. Mpže se primjenjivati na SAMO pozivitvnim vrijednostima
        System.out.println(result1);
        int result2 = a << 1;
        System.out.println(result2);
    }
}
