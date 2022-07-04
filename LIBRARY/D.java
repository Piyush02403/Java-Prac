// if we want to use both dates class in same program so the compiler will confuse that which
//date class is it going to use

import java.util.Date;
import java.sql.Date;
 
class D{
    public static void main(String[] args) {
        Date date = new Date();  // want to use java.util.Date
        System.out.println(date);

        Date date = new Date(9093058576l);
        System.out.println(date);  // want to use java.sql.Date
    }
}
        //  error: reference to Date is ambiguous
        //  both class java.util.Date in java.util and class java.sql.Date in java.sql match