package MySelf._0_publicmain;

public class _04_publicmain {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");
        merhabayaz();
        toplamyaz(4,5);

        int enb=enbBul(4,5);
        System.out.println("enb = " + enb);

    }
    public static int enbBul (int s1, int s2){
        int enb=s1;
        if (s2>s1)
            enb=s2;
        return enb;


    }
    public static void  merhabayaz(){
        System.out.println("Merhaba Dünya");


    }
    public static void toplamyaz(int s1, int s2) {
        System.out.println(s1+s2);


    }
}
