package Day3.interfacePart;

public interface Interface1 {

    int num1 = 10;
    static int num2 = 20;
    final int num3 = 30;

    public static void func1() {
        System.out.println("Static method body");
    }

    abstract void func2();
    default void func3(){
        System.out.println("Default method body");
    }

}
