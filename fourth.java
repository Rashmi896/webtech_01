public class fourth {
    public static void main(String[] args) {
        // with variable
        int x = 5, y = 10;
        int v;
        v = x;
        x = y;
        y = x;
        System.out.println("Swap with third variable");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        // without variable
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap without third variable");
        System.out.println(a);
        System.out.println(b);

    }
}
