//  TO USE BOTH DATE CLASSES  IN ONE PROGRAM WE HAVE TO B.java date technique to initiate

import java.sql.Date;

class D1{
    public static void main(String[]args){
        Date date = new Date(98569406042l);
        System.out.println(date);

        java.util.Date dt = new java.util.Date();
        System.out.println(dt);
    }
}
