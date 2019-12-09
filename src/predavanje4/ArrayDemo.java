package predavanje4;
//TIPOVI PODATAKA
//Prosti i složeni
// TIP IME_OBJEKTA/VARIJABLE VRIJEDNOST

public class ArrayDemo {

    public static void main(String[] args) {
        int number = 23;
        //1. Način za kreiranje niza je da zauzme prostor od 3x32 bita i u taj prostor ubaciti vrijednost
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 2324;
        numbers[2] = 12;
        //2. Način za kreiranje niza, koristi se kod poznatih vrijednosti i poznate duzine niza
        int[] brojevi = {23, 2324, 12};
        System.out.println(numbers[1]);
        System.out.println(brojevi[2]);
    }
}
