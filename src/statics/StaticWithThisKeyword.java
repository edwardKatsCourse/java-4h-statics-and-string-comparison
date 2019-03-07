package statics;

public class StaticWithThisKeyword {

    public static void main(String[] args) {

        SomeInstance.print();

        SomeInstance someInstance = new SomeInstance();
        someInstance.printInstance();
        someInstance.print();

        /**
         * "this" -> "static"
         * from "static" cannot be referred "this"
         */

    }
}


class SomeInstance {

    static String staticName;

    String name;

    public SomeInstance() {
        staticName = "new value";
    }

    public static void print() {
//        this.name = "instance name";
    }

    public void printInstance() {

    }
}