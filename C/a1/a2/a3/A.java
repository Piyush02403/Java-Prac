// .* = wild card character
package a1.a2.a3;

import b1.*;   // we can access all the files in the location but we cant access the files
import b1.b2.B;  // which are in different sub - folders

class A{
    public static void main(String[]args){
        
        B x = new B();
        C y = new C();
        D z = new D();

        x.pro1();
        y.pro2();
        z.pro3();
    }
}