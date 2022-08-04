package MySelf._0_publicmain;

public class _6_publicmain {
    public static void main(String[] args) {

        int s1=4;
        int s2=8;
        int s3=45;
        int s4=65;
        int sonuc1=toplam(s1+s2);
        int sonuc2=toplam(s1+s2+s3);
        int sonuc3=toplam(s1+s2+s3+s4);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }

    public static int toplam (int... sayilar){
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++)
            toplam=toplam+sayilar[i];
        return toplam;

    }
}
