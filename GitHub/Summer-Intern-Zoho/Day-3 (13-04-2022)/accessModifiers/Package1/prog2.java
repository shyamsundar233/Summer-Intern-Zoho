package accessModifiers.Package1;

public class prog2 {
    public static void main(String[] args){
        prog1 obj = new prog1();
        obj.printPublic();
        obj.printProtected();
        System.out.println(obj.x);
        System.out.println(obj.z);
    }
}
