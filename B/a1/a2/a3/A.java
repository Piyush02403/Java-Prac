
// if we dont want to use import statement again and again for the files with same package loaction then we have 
// an import statement = b1.b2.*;

package a1.a2.a3;

import b1.b2.*;


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
