import java.util.*;

public class Prog1 {

    static int[] arr = new int[100];
    static int count;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int element = sc.nextInt();
        while(element!=-1){
            insert(element);
            element = sc.nextInt();
        }

        print();
        System.out.println(size());
    }

    static void insert(int number){
        if(count==arr.length){
            int[] temp = new int[count * 2];
            int i=0,j=count-1;
            while(i<=j){
                temp[i] = arr[i];
                temp[j] = arr[j];
                i++;
                j--;
            }
            arr = temp;
        }
        arr[count++] = number;
        System.out.println(number + " Element inserted");
    }

    static void print(){
        if(count==0){
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Elements in array");
        for(int i=0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int size(){
        if(count==0){
            System.out.println("Array is empty");
            return 0;
        }
        return count;
    }

}
