package strings;

import java.util.Date;

public class StringInterpolation {

    public static void main(String[] args) {
        String name = "John";
        Integer age = 44;
        String city = "Haifa";

        String print = "Name is: " + name + ", Age is: " + age + ", City: " + city;

        System.out.println(print);

        // \n -> new line
        // \t -> tab
        String formattedPrint = String.format("Name is: %s,\nAge is: %s, %nCity: %s",
                                                       name, age, city);

        /**
         * %s -> string
         * %n -> new line
         * %d -> digit
         */


        System.out.println(formattedPrint);

        System.out.println(String.format("Char is: %c", '\u044f'));

        Date currentDate = new Date();
        System.out.println(String.format("Date is: %tD", currentDate));
        System.out.println(String.format("Time is: %tR", currentDate));


        System.out.println(String.format("Custom datetime: %te-%tB-%tY %tH:%tM",
                currentDate,
                currentDate,
                currentDate,
                currentDate,
                currentDate));

        //profiling - time count between operations
        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();


    }
}
