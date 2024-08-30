class Employee {
    int eid = 101;

    public void m1() {
        System.out.println("Employee m1()");

    }

    public static void main(String[] args) {
        // non-static members-using object
        Employee e1 = new Employee();
        System.out.println(e1.eid);
        e1.m1();
    }
}