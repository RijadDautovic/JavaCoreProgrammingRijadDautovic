package predavanje3.control;

public class BlockDemo {

    public static void main(String[] args) {
        System.out.println("Šta ima? ");
        int number = 023;
        System.out.println(number);
        boolean condition = number > 12;
        if (condition) {
            System.out.println("Ušao si u blok koda IF konstrukcije");
        } else {
            System.out.println("Uletio si u blok koda ELSE konstrukcije");
        }
    }
}
