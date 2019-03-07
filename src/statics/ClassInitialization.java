package statics;

public class ClassInitialization {

    public static void main(String[] args) {

        A.printStaticInstance();
        A.printStaticInstance();
        A.printStaticInstance();
        A.printStaticInstance();

        System.out.println();
        System.out.println("-------------");
        System.out.println();

        new A().printInstance();
        System.out.println();

        System.out.println("-------------");

        System.out.println();
        new A().printInstance();
    }
}


class A {

    static int a;

    static int getA() {
        return a;
    }

    //Static Block
    static {
        System.out.println("static block");
    }

    public static void printStaticInstance() {
        System.out.println("Printed STATIC method");
    }

    public A() {
        System.out.println("constructor");
    }

    public void printInstance() {
        System.out.println("Printed instance");
    }
}