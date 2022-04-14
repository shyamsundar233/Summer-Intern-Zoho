package superMarketBilling;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class displayProducts extends Home{

    public void view(){

        System.out.println("\t\t\tProducts");

        for(int i=0;i<home.category.size();i++){
            System.out.println("Category no: " + (i+1) + ". " + home.category.get(i));
            System.out.println("------------------------------------");
            for(int j=0;j<home.subCategory.get(i).size();j++){
                System.out.println("Subcategory no: " + (j+1) + ". " + home.subCategory.get(i).get(j));
                System.out.println("------------------------------------");
                Map<String, Integer> temp = home.product.get(i).get(j);
                ArrayList<String> product = new ArrayList<String>();
                ArrayList<Integer> price = new ArrayList<Integer>();
                ArrayList<Integer> coupon = new ArrayList<Integer>();
                int k=0;
                for (Map.Entry<String, Integer> entry : temp.entrySet()) {
                    product.add(entry.getKey());
                    price.add(entry.getValue());
                }
                temp = home.offer.get(i).get(j);
                for(Map.Entry<String, Integer> entry:temp.entrySet()){
                    coupon.add(entry.getValue());
                }
                for(int itr=0;itr<product.size();itr++){
                    System.out.println("Product no: " + (k+1) + ". " + product.get(itr) + " - " + price.get(itr) + " - " + coupon.get(itr));
                    k++;
                }
                if(j<home.subCategory.get(i).size()-1) System.out.println("------------------------------------");
            }
            if(i<home.category.size()-1) System.out.println("------------------------------------");
        }
        System.out.println("------------------------------------");

    }

}
