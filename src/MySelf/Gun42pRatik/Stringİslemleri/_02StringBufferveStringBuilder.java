package MySelf.Gun42pRatik.Stringİslemleri;

import java.util.Arrays;

public class _02StringBufferveStringBuilder {
    public static void main(String[] args) {
        // String değişkeni çok fazla ekleme veya işlemlere
        // göre perfomansı oldukça düşük.
        String cumle="";
        cumle = cumle + "Bugün ";
        cumle = cumle + " hava";
        cumle = cumle + " güzel";

        System.out.println("cumle1 = " + cumle);
        cumle = cumle.concat(" oldu"); // atama gerekir
        System.out.println("cumle2 = " + cumle);

        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır. Fakat paralel çalışan
        // uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

        StringBuilder b=new StringBuilder();
        b.append("Bugün");//tekrar kendine concatteki gibi atama gerekmez
        b.append(" hava");
        b.append(" güzel");

        System.out.println("b = " + b);
        System.out.println("b.length() = " + b.length());

        b.append(4);// herşeyi stringe çevirip ekler
        System.out.println("b = " + b);

        b.reverse();//Stringi tersine çevirir
        System.out.println("b = " + b);

        b.delete(0,5);// 0 dahil 5 hariç indexe göre siler
        System.out.println("b = " + b);

        b.deleteCharAt(3);// sadece belirtilen indexi siler
        System.out.println("b = " + b);

        b.insert(5, "kelime");// 5 nolu indexe kelime eklendi
        System.out.println("b = " + b);

        b.insert(4,5.46);// 4 nolu indexe rakamda double da eklenebilir
        System.out.println("b = " + b);

        int[] dizi={1,2,45,78};
        b.insert(6, Arrays.toString(dizi));
        System.out.println("b = " + b);

        b=new StringBuilder("Bugün hava çok sıcak");//sıfırlandı ve ilk değer atandı
        System.out.println("b = " + b);

        b.replace(3,8,"bu");//verilen aralığı verilenle değiştirir
        System.out.println("b = " + b);



    }
}
