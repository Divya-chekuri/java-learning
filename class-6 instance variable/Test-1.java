public class Test {
    int a = 100; // instance varialbe
    static int b = 200; // static variable

    public static void main(String[] args) {
        int c = 300; // local variable
        Test t1 = new Test();
        System.out.println(t1.a);
        System.out.println(b);

    }

}