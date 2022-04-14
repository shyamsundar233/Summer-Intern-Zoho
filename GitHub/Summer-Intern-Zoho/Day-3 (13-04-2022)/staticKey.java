class cl1{

    public static int num1 = 10;
    public int num2 = 20;
    
    public static void func1(){
        System.out.println("It is static");
    }

    public void func2(){
        System.out.println("It is unstatic");
    }
}

public class staticKey extends cl1{

    public static void main(String[] args){
        func1();
        System.out.println(num1);
        cl1 obj = new cl1();
        obj.func2();
        System.out.println(obj.num2);
    }

}
