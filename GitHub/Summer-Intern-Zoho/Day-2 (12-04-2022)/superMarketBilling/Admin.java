package superMarketBilling;

import java.util.*;

public class Admin extends Home{

    static Scanner sc = new Scanner(System.in);

    public void adminHome(){

        while(true){

            System.out.println("1.Add");
            System.out.println("2.Edit");
            System.out.println("3.Add offers");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.print("Category: ");
                    String category = sc.nextLine();
                    home.Category(category);
                    System.out.print("Subcategory: ");
                    String subCategory = sc.nextLine();
                    home.SubCategory(category, subCategory);
                    char ch = 'y';
                    while (ch=='y' || ch=='Y'){
                        System.out.print("Product: ");
                        String product = sc.nextLine();
                        System.out.print("Price: ");
                        int price = sc.nextInt();
                        home.Products(category, subCategory, product, price);
                        System.out.println("Product added");
                        System.out.print("If you want to add more(Y/N): ");
                        ch = sc.next().charAt(0);
                        sc.nextLine();
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Category: ");
                    category = sc.nextLine();
                    System.out.print("Subcategory: ");
                    subCategory = sc.nextLine();
                    ch = 'y';
                    while (ch=='y' || ch=='Y'){
                        System.out.print("Product: ");
                        String product = sc.nextLine();
                        System.out.print("Price: ");
                        int price = sc.nextInt();
                        home.Products(category, subCategory, product, price);
                        System.out.println("Product added");
                        System.out.print("If you want to edit more(Y/N): ");
                        ch = sc.next().charAt(0);
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Category: ");
                    category = sc.nextLine();
                    System.out.print("Subcategory: ");
                    subCategory = sc.nextLine();
                    ch = 'y';
                    while (ch=='y' || ch=='Y'){
                        System.out.print("Product: ");
                        String product = sc.nextLine();
                        System.out.println("10101 - Buy 1 Get 1");
                        System.out.println("10102 - Buy 1 Get 2");
                        System.out.println("10103 - 10% discount");
                        System.out.println("10104 - 20% discount");
                        System.out.print("Offer code: ");
                        int offer_code = sc.nextInt();
                        home.Offers(category, subCategory, product, offer_code);
                        System.out.println("Offer added");
                        System.out.print("If you want to add more(Y/N): ");
                        ch = sc.next().charAt(0);
                    }
                    break;
                case 4:
                    home.display();
                    break;
                case 5:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Invalid Option\nTry again");
            }


        }

    }

}
