package superMarketBilling;

import java.util.*;

public class Customer extends Home{

    public void customerHome(){

        display.view();

        Scanner sc = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        ArrayList<Integer> rate = new ArrayList<Integer>();
        int total = 0;

        char ch = 'y';

        while(ch=='y' || ch=='Y'){

            System.out.print("Enter the category number: ");
            int index1 = sc.nextInt() - 1;
            System.out.print("Enter the subcategory number: ");
            int index2 = sc.nextInt() - 1;
            System.out.print("Enter the product number: ");
            int index3 = sc.nextInt() - 1;
            System.out.print("Enter the quantity: ");
            int quants = sc.nextInt();
            Map<String, Integer> temp = home.product.get(index1).get(index2);
            Map<String, Integer> temp1 = home.offer.get(index1).get(index2);
            int c=0, off_code = -1;
            for(Map.Entry<String, Integer> entry: temp1.entrySet()){
                if(c==index3 && entry.getValue()!=null){
                    off_code = entry.getValue();
                    break;
                }
            }
            c=0;
            for(Map.Entry<String, Integer> entry:temp.entrySet()){
                if(c==index3){
                    items.add(entry.getKey());
                    int[] offDisc = offs.applyOffer(entry.getValue() * quants, quants, off_code);
                    rate.add(offDisc[0]);
                    quantity.add(offDisc[1]);
                    total+=offDisc[0];
                    break;
                }
                c++;
            }

            System.out.print("If you want to buy more(Y/N): ");
            ch = sc.next().charAt(0);
        }

        printBill billView = new printBill();
        billView.displayBill(items, rate, quantity, total);

    }

}
