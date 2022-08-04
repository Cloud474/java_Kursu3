package MySelf._0_HuseyinBulut;

public class _03HüseyinBulut {
    public static void main(String[] args) {

        String cümle="I love java";
        int uzunluk=cümle.length();
        System.out.println("uzunluk = " + uzunluk);

        String cümle2="Sprint planning";
        int uzunluk2=cümle2.length();
        System.out.println("uzunluk2 = " + cümle2.length());

        String kelime="apple";
        boolean Varmi=kelime.contains("app");
        System.out.println("Varmi = " + kelime.contains("app"));

        String K1="orange";
        String K2="Apple";
        boolean eşitmi=K1.equals(K2);
        System.out.println("eşitmi = " +K1.equals(K2));

        String kelime1="apple";
        String kelime2="Apple";
        System.out.println("kelime2 = " + kelime2.equalsIgnoreCase(kelime1));

        String isim="florida";
        System.out.println("isim.indexof(o) = " + isim.indexOf("o"));

        String Cümle="Thank you";
        System.out.println("Konum = " + Cümle.indexOf("y"));


        String Yapi="Mouse";
        char üçüncüharf=Yapi.charAt(3);
        System.out.println("üçüncüharf = " + üçüncüharf);












    }
}
