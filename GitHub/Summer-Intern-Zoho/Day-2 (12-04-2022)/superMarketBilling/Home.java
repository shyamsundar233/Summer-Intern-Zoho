package superMarketBilling;

import java.util.*;

public class Home extends products{

    public static Home home = new Home();
    public static Admin admin = new Admin();
    public static Customer customer = new Customer();
    public static displayProducts display = new displayProducts();
    public static offers offs = new offers();

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1.Admin");
            System.out.println("2.Customer");
            System.out.println("3.Exit");
            System.out.print("Login: ");
            int ch = sc.nextInt();
            if(ch==1){
                admin.adminHome();
            }else if(ch==2){
                customer.customerHome();
            }else if(ch==3){
                System.out.println("Thank you");
                System.exit(0);
            }else{
                System.out.println("Invalid Option\nTry again");
            }

        }

    }

}
