package tryCatch;

public class prog1 {

    public static void main(String[] args){
        try{
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[2]);
            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println("Array index out of bounds");
        }finally {
            System.out.println("Finally done!!");
        }
        System.out.println("EOF");

        int x = 10;
        if(x==10){
            throw new ArithmeticException("X is equal to 10");
        }else{
            throw new ArithmeticException("X is not equal to 10");
        }

    }

}
