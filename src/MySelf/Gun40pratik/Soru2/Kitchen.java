package MySelf.Gun40pratik.Soru2;

import java.util.ArrayList;

public class Kitchen {

    public static void MenuYaz(){
        System.out.println("Menü*\n" +
                "1-Adana Kebap (55 TL)\n" +
                "2-Lahmacun (33 TL)\n" +
                "3-Borsh (33 TL)\n" +
                "4-Palov (44 TL)\n" +
                "0-Tamam");
    }

    public static void yaz(ArrayList<Food> foods, int secim){
        if (secim==1){
            foods.add(new AdanaKebap());}
        else if (secim == 2) {
            foods.add(new Lahmacun());}
        else if (secim==3) {
            foods.add(new Borsh());}
        else if (secim==4) {
            foods.add(new Pilav());}
    }
    public static double ucret(ArrayList<Food> foods){
        double ucret=0;
        for (Food f:foods){
            if (f instanceof AdanaKebap){
                ucret=ucret+((AdanaKebap) f).ucret();}
            else if (f instanceof Lahmacun){
                ucret=ucret+((Lahmacun) f).ucret();}
           else if (f instanceof Borsh){
                ucret=ucret+((Borsh) f).ucret();}
            else if (f instanceof Pilav){
                ucret=ucret+((Pilav) f).ucret();}
        }
        return ucret;
    }

    public static void yazdir(ArrayList<Food> foods){
        for (Food f: foods){
            if (f instanceof AdanaKebap){
                System.out.println(AdanaKebap.class.getSimpleName());
                ((AdanaKebap) f).grill();
                ((AdanaKebap) f).marianadel();}
            if (f instanceof Lahmacun){
                System.out.println(Lahmacun.class.getSimpleName());
                ((Lahmacun) f).addMeat();
                ((Lahmacun) f).bake();
                ((Lahmacun) f).dough();}
            if (f instanceof Borsh){
                System.out.println(Borsh.class.getSimpleName());
                ((Borsh) f).boil();
                ((Borsh) f).eatTomorrow();}
            if (f instanceof Pilav){
                System.out.println(Pilav.class.getSimpleName());
                ((Pilav) f).boil();
                ((Pilav) f).fry();}
        }
    }
}
