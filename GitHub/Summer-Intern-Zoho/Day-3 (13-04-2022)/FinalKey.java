class cl2{
    static final void print(){
        System.out.println("Final");
    }
    static final void print(int a){
        System.out.println("Final " + a);
    }
}

final class cl3{
    public final void display(){
        System.out.println("Final class");
    }
}

public class FinalKey extends cl2{

    public static void main(String[] args){
        print();
        print(10);
        cl3 obj = new cl3();
        obj.display();
    }

    public void print(int a, int b){

    }

}
