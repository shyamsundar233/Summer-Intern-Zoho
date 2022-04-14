package Day3.interfacePart;

public class iFace implements Interface1{

    public void func2(){
        System.out.println("Public method body");
    }

    public static void main(String[] args){
        iFace obj = new iFace();
        obj.func3();
        obj.func2();
        Interface1.func1();
        System.out.println(Interface1.num1 + " " + Interface1.num2 + " " + Interface1.num3);
    }

}
