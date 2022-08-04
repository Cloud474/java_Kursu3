package MySelf.Ödev.GenelÖdev.Soru4;

public class soru4 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,12};
        int enb=0;
        for (int i = 0; i < a.length; i++)
            enb=a[i];
        int enk=a[0];
        for (int sayi:a)
            if (enk>sayi)
                enk=sayi;
        int fark=enb-enk;
        System.out.println("fark = " + fark);




    }
}
