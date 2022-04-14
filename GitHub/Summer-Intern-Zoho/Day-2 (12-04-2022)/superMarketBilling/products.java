package superMarketBilling;

import java.util.*;

public class products{

    public ArrayList<String> category = new ArrayList<String>();
    public List<List<String>> subCategory = new ArrayList<>();
    public List<List<Map<String, Integer>>> product = new ArrayList<>();
    public List<List<Map<String, Integer>>> offer = new ArrayList<>();
    public boolean flag = true;

    public void Category(String category){
        if(this.category.indexOf(category)==-1) {
            this.category.add(category);
        }
    }

    public void SubCategory(String category, String subCategory){
        flag = true;
        int index = this.category.indexOf(category);
        if(index==-1) {
            flag = false;
            System.out.println("Category not found");
            return;
        }
        if(index<this.subCategory.size()){
            this.subCategory.get(index).add(subCategory);
        }else{
            this.subCategory.add(new ArrayList<>());
            this.subCategory.get(index).add(subCategory);
        }
    }

    public void Products(String category, String subCategory, String product, int price){
        flag = true;
        int index1 = this.category.indexOf(category);
        if(index1==-1){
            flag = false;
            System.out.println("Category not found");
            return;
        }
        if(index1>=this.product.size()){
            this.product.add(new ArrayList<>());
            this.offer.add(new ArrayList<>());
        }
        int index2 = this.subCategory.get(index1).indexOf(subCategory);
        if(index2==-1){
            flag = false;
            System.out.println("Subcategory not found");
            return;
        }
        if(index2>=this.product.get(index1).size()){
            this.product.get(index1).add(new HashMap<>());
            this.offer.get(index1).add(new HashMap<>());
        }
        this.product.get(index1).get(index2).put(product, price);
        this.offer.get(index1).get(index2).put(product, null);

    }

    public void Offers(String category, String subCategory, String product, int offer){
        flag = true;
        int index1 = this.category.indexOf(category);
        if(index1==-1){
            flag = false;
            System.out.println("Category not found");
            return;
        }
        int index2 = this.subCategory.get(index1).indexOf(subCategory);
        if(index2==-1){
            flag = false;
            System.out.println("Subcategory not found");
            return;
        }
        this.offer.get(index1).get(index2).put(product, offer);
    }

    public int findCategory(String category){
        int index = this.category.indexOf(category);
        return index;
    }

    public int findSubCategory(String category, String subCategory){
        int index = this.category.indexOf(category);
        int index1 = this.subCategory.get(index).indexOf(subCategory);
        return index1;
    }

    public boolean findProduct(String category, String subCategory, String product){
        int index = this.category.indexOf(category);
        int index1 = this.subCategory.get(index).indexOf(subCategory);
        boolean f = this.product.get(index).get(index1).containsKey(product);
        return f;
    }

    public void display(){
        System.out.println("Products");
        System.out.println(category);
        System.out.println(subCategory);
        System.out.println(product);
        System.out.println(offer);
    }

}
