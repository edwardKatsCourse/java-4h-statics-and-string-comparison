package statics;

public class ClassInitializationFailure {

    public static void main(String[] args) {
        try {
            new AA(true).printMessage();
        } catch (Throwable e) {
        }

        System.out.println();
        System.out.println();
        new AA(false).printMessage();

        System.out.println();
        System.out.println();
        System.out.println();

        AA.printStaticMessage();
        AA.printStaticMessage();
        AA.printStaticMessage();
        AA.printStaticMessage();
    }
}

class AA {

    static {
        System.out.println("static block");
//        if (true) {
//            throw new IllegalArgumentException();
//        }
    }

    public static void printStaticMessage() {
        System.out.println("Static message");
    }

    public AA(boolean isFailed) {
        System.out.println("constructor");

        if (isFailed) {
            System.out.println("constructor failed");
            throw new IllegalArgumentException();
        }
    }

    public void printMessage() {
        System.out.println("My instance message");
    }
}
