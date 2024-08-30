class Employee {
    static int eid = 10;

    public static void m1() {
        System.out.println("Employee class - m1 method");

    }

    public static void main(String[] args) {
        // static members-using object
        System.out.println(eid);
        // m1();
    }
}