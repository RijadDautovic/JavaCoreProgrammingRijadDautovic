package predavanje4;

public class MultiDimensionalDemo {

    public static void main(String[] args) {
        String[][] namesSurnamesArray = {
            {"Hodžić", "Nikolić", "Oručević"},
            {"Amar", "Marko", "Bakir"}

        };
        System.out.println(namesSurnamesArray[0][0] + " " + namesSurnamesArray[1][0]);
        System.out.println(namesSurnamesArray[0][1] + " " + namesSurnamesArray[1][1]);
        System.out.println(namesSurnamesArray[0][2] + " " + namesSurnamesArray[1][2]);

    }

}
