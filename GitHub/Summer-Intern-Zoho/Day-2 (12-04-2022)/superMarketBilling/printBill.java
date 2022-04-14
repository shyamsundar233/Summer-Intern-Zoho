package superMarketBilling;

import java.util.*;

public class printBill extends Customer{

    public void displayBill(ArrayList<String> items, ArrayList<Integer> quantity, ArrayList<Integer> rate, int total){

        System.out.println("\t\tCash Bill");

        System.out.println("Items     " + "Qty" + "      Rate");

        for(int i=0;i<items.size();i++){
            System.out.print(items.get(i));
            int sp_len = 10 - items.get(i).length();
            for(int sp=0;sp<sp_len;sp++){
                System.out.print(" ");
            }
            System.out.print(quantity.get(i));
            sp_len = 10 - Integer.toString(quantity.get(i)).length();
            for(int sp=0;sp<sp_len;sp++){
                System.out.print(" ");
            }
            System.out.println(rate.get(i));
        }

        System.out.println("\t\t\tTotal: " + total);

    }

}
