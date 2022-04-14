package accessModifiers.Package1;

public class prog1 {

    public int x = 10;
    private int y = 20;
    protected int z = 30;

    public static void main(String[] args){
        System.out.println("Main");
        prog1 obj = new prog1();
        obj.printPublic();
        obj.printPrivate();
        obj.printProtected();

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);

    }

    public void printPublic(){
        System.out.println("Public");
    }

    private void printPrivate(){
        System.out.println("Private");
    }

    protected void printProtected(){
        System.out.println("Protected");
    }

}
