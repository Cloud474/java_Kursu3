package MySelf.Gun24pratik;

import java.util.ArrayList;

public class _2Hashsetyazma {
    public static void main(String[] args) {

        ArrayList<String> renkler=new ArrayList<>();
        renkler.add("red");
        renkler.add("green");
        renkler.add("blue");
        renkler.add("Pink");
        renkler.add("red");
        renkler.add("RED");
        //ekrana yazdırma1.yöntem
        System.out.println("renkler = " + renkler);

        //2.yöntem
        for (String s :  renkler) {
            System.out.println("s = " + s);//renklerin herhangi bir sırayla s ismini vererek gönderiyor
        }




    }
}
