// THERE IS ANOTHER CLASS LIBRARY CALLED FILE WHICH IS USED TO GIVE NAME TO THE FILE

import java.util.Date;

import java.io.File;

class E{
    public static void main(String[]args){
        Date date = new Date();
        System.out.println(date);

        File file = new File("abc.txt");
        System.out.println(file);

    } 
}