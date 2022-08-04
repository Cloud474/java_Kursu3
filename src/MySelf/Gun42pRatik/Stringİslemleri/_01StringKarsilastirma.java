package MySelf.Gun42pRatik.Stringİslemleri;

public class _01StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="Bugun hava çok güzel";
        String cumle2="Bugun hava çok güzel";

        String cumle3=new String("Bugun hava çok güzel");
        String cumle4=new String("Bugun hava çok güzel");

        if (cumle1==cumle2)// ilkel tipler için değerler aynı, nesneler için aynı nesne mi
            System.out.println("cumle 1 cumle 2ye eşit");
        else System.out.println("eşit değil");

        if (cumle1.equals(cumle2))//ilkel tipler için değerler ve nesneler aynı mı
            System.out.println("cumle 1 cumle 2 ye eşit");
        else
            System.out.println("eşit değil");
        //***************

        if (cumle3==cumle4)// ilkel tipler için değerler aynı, nesneler için aynı nesne mi
            System.out.println("cumle 1 cumle 2ye eşit");
        else System.out.println("eşit değil");

        if (cumle3.equals(cumle4))//ilkel tipler için değerler ve nesneler aynı mı
            System.out.println("cumle 1 cumle 2 ye eşit");
        else
            System.out.println("eşit değil");



    }
}
