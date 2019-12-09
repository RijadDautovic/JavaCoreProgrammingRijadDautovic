package predavanje4.loops;

public class EnhancedForDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            int vrijednostNaItojPoziciji = numbers[i];
            System.out.println(vrijednostNaItojPoziciji);
        }
        System.out.println("ENHANCED");
        for (int mutant : numbers) {
            if (mutant % 2 == 0) {
                System.out.println(mutant);
            }
        }
    }
}
