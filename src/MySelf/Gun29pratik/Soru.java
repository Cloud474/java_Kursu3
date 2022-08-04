package MySelf.Gun29pratik;

public class Soru {
    public static void main(String[] args) {

        Book ktp=new Book("Suç ve Ceza",1998,"Tolstoy");
        Book ktp1=new Book("yargıç",1990);
        Book ktp2=new Book("gecenin katili");

        ktp.Yazdir();
        ktp1.Yazdir();
        ktp2.Yazdir();

        System.out.println("ktp = " + ktp);
        System.out.println("ktp1 = " + ktp1);
        System.out.println("ktp2 = " + ktp2);
    }
}
