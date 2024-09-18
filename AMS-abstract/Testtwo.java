abstract class A {
    abstract void m1();

}

class B extends A {
    public void m1() {
    }

}

class Test {
    public static void main(String[] args) {
        new B();
    }
}
