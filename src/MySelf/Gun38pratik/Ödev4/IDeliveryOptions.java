package MySelf.Gun38pratik.Ödev4;

import java.util.ArrayList;

public interface IDeliveryOptions {

     int AmazonMinFreeDelivery = 10000;
     int CostcoMinFreeDelivery =  15000;
     static int getTheTotal(ArrayList<String> bisey){
        return getTheTotal(bisey);
    }

    static String isFreeShipping(ArrayList<String> bisey1){
        return isFreeShipping(bisey1);
    }
}
