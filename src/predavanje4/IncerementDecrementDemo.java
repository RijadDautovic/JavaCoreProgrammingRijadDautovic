package predavanje4;

public class IncerementDecrementDemo {

    public static void main(String[] args) {
        int a = 2, b = 3;
        add(a, b++);
        add(a, ++b);

    }

    private static void add(int a, int b) {
        int res = a * (b++) + b;
        int res1 = a * (++b) + b;
        System.out.println(res);
        System.out.println(res1);
    }
}
