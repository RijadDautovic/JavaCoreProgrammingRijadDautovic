package predavanje3;

public class ObjectTypeExecutor {

    public static void main(String[] args) {
        int number = 10;
        char karakter = 'R';
        String name = new String("Rijad").intern();
        String name1 = "Rijad"; //String literal - efikasniji je.
        if (name.equals(name1)) {
            System.out.println("Jednake varijable");
        } else {
            System.out.println("Varijable nisu jednake");
        }
    }
}
