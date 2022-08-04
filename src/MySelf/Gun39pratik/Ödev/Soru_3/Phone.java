package MySelf.Gun39pratik.Ödev.Soru_3;

import java.util.ArrayList;

public abstract class Phone {

    public ArrayList<String> cart=new ArrayList<>();

    public int getSum(ArrayList<String> cart){
        int toplam=0;
        for (String c :cart){
            int rakam=Integer.parseInt(c.replaceAll("[^0-9]", ""));
        toplam+=rakam;}
        return toplam;
    }

    public abstract void options(String memory, String screen);
}
