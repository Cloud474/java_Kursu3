package MySelf.Gun28prati._2soru;

public class Soru {
    public static void main(String[] args) {
        //Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        //  kullanımlarını yazınız

        Utilitiy.getMax(5,4);
        Utilitiy.getMin(3,7);
        Utilitiy.getAbs(5);
        Utilitiy.getRandom(1,5);
        Utilitiy.getCeil(3);

        int[] dizi={3,5,7,9,12,45};
        Utilitiy.getdiziElemanlarTopla(dizi);

        System.out.println("Utilitiy.getMax(5,4) = " + Utilitiy.getMax(5, 4));
        System.out.println("Utilitiy.getMin(3,7) = " + Utilitiy.getMin(3, 7));
        System.out.println("Utilitiy.getAbs(5) = " + Utilitiy.getAbs(5));
        System.out.println("Utilitiy.getRandom(1,5) = " + Utilitiy.getRandom(1, 5));
        System.out.println("Utilitiy.getCeil(3) = " + Utilitiy.getCeil(3));
        System.out.println("Utilitiy.getdiziElemanlarTopla(dizi) = " + Utilitiy.getdiziElemanlarTopla(dizi));



    }
}
