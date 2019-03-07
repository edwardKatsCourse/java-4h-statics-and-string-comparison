package statics;

import java.util.Date;
import static statics.BB.*;
import static statics.StaticImport.*;

public class StaticImportExample {

    public static void main(String[] args) {
        Date d = new Date();


//        StaticImport.printMessage();
//
//        printMessage();

    }
}

class BB {
    public static void printMessage() {
        System.out.println("printing BB message");
    }
}

class StaticImport {

    static {
        System.out.println("static block");
    }


    public static void printMessage() {
        System.out.println("printing message");
    }

    public static String getAge() {
        return "Age is 22";
    }
}