package Abstract;

abstract class abs{
    abstract void print();
    public static void display(){
        System.out.println("Display");
    }
}

public class prog1 extends abs{

    @Override
    void print(){
        System.out.println("Print");
    }

    public static void main(String[] args){
        prog1 obj = new prog1();
        obj.print();
        display();
    }

}
