package accessModifiers.Package2;

import accessModifiers.Package1.*;

public class prog3 extends prog1{
    public static void main(String[] args){
        prog1 obj1 = new prog1();
        prog3 obj = new prog3();
        obj1.printPublic();
        obj.printProtected();
        System.out.println(obj1.x);
        System.out.println(obj.z);
    }
}
