package predavanje3;

public class MultiDimDemo {

    public static void main(String[] args) {
        String[][] namesSurnamesArray = {
            {"Hodzic", "Nikolic", "Orucevic"},
            {"Amar","Marko","Bakir"}
        };
        System.out.println(namesSurnamesArray [0][0] +" " + namesSurnamesArray [1][0]);
        System.out.println(namesSurnamesArray [0][1] +" " + namesSurnamesArray [1][1]);
        System.out.println(namesSurnamesArray [0][2] +" " + namesSurnamesArray [1][1]);
    }
}
