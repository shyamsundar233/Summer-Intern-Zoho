package superMarketBilling;

public class offers extends Home{

    public int[] applyOffer(int rate, int quantity, int offer_code){

        int[] res = new int[2];

        if(offer_code==-1){
            res[0] = rate;
            res[1] = quantity;
            return res;
        }

        if(offer_code==10101){
            res[0] = rate;
            res[1] = buy1Get1(quantity);
            return res;
        }
        if(offer_code==10102){
            res[0] = rate;
            res[1] = buy1Get2(quantity);
            return res;
        }
        if(offer_code==10103){
            res[0] = disc10(rate);
            res[1] = quantity;
            return res;
        }
        if(offer_code==10104){
            res[0] = disc20(rate);
            res[1] = quantity;
            return res;
        }
        return res;

    }

    public static int buy1Get1(int quantity){
        return quantity * 2;
    }

    public static int buy1Get2(int quantity){
        return quantity * 3;
    }

    public static int disc10(int rate){
        double num = 0.1 * rate;
        return rate-(int) Math.round(num);
    }

    public static int disc20(int rate){
        double num = 0.2 * rate;
        return rate-(int) Math.round(num);
    }

}
