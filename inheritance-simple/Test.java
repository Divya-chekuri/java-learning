class parent {
    void m1() {
    }

    void m2() {
    }

    public static void main(String[] args) {
        parent p1 = new parent();
        p1.m1();
        p1.m2();
        child c1 = new child();
        c1.m1();
        c1.m2();
        parent c2 = new child();
        c2.m1();
        c2.m2();

    }
}