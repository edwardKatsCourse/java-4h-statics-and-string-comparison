package statics;

public class Main {
    /**
     * Backward compatibility
     *
     * C# (.NET 4.0 2010)
     * "Visual Studio 2010"
     *
     * C# (.NET 4.5 2012)
     * "Visual Studio 2012"
     *
     * ------------------------
     * Java (1.5 2005-2006)
     *
     * Java (1.8 2013)
     *
     * ------------------------
     * Python
     * v2
     *
     * v3
     */

    public static void main(String[] args) {
        Person john = new Person();
        john.setName("John");
        Person.setStaticName("Static John");

        System.out.println("this.name: " + john.getName());
        System.out.println("static name: " + Person.getStaticName());
        System.out.println();

        Person sarah = new Person();
        sarah.setName("Sarah");
        System.out.println("this.name: " + sarah.getName());
        System.out.println("static name: " + Person.getStaticName());

        System.out.println();

        Person p1 = new Person();
        System.out.println("this.name: " + p1.getName());
        System.out.println("static name: " + p1.getStaticName());

        System.out.println();

        p1.setStaticName("abc");
        System.out.println("nameless person's static name: " + new Person().getStaticName());
        System.out.println("John's static name: " + john.getStaticName());
        System.out.println();

        System.out.println(Person.staticName);

        /**
         * Instance -> new statics.Person()
         * Class    -> statics.Person
         *
         * 1 000 000 persons, having name
         * In memory:
         *
         * 1 000 000 names
         * 1 (one)  static name
         */

    }

}

class Person {
    static String staticName;
    public static String getStaticName() {
        return staticName;
    }

    public static void setStaticName(String n) {
        staticName = n;
    }

    String name;
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}