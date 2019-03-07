package strings;

public class EqualsVsEqualsEquals {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";

        //for "a" and "b" Java creates ONE object

        String c = /*new String(*/  "he"   /*)*/;
        c = c + "llo";

        //By this point(!) there 2 objects for 3 strings

        String d = new String("hello");
        String e = new String("hello");

        System.out.println(a == b); //true
        System.out.println(a == c); //false

        System.out.println(a == d); //false
        System.out.println(d == e); //false

        /**
         * by-value         -> primitives (8 types; int, double)
         * by-reference     -> objects
         */
        Person john = new Person("john");
        Person john_1 = new Person("john");

        System.out.println("people");
        System.out.println(john.equals(john_1));



    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean equals(Person other) {
        if (other.name.equals(this.name)) {
            return true;
        }
        return false;
    }
}
