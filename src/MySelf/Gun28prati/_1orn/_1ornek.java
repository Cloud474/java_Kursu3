package MySelf.Gun28prati._1orn;

public class _1ornek {
    public static void main(String[] args) {

        //1.yöntem klasik metodları kendimiz yazıyoruz
        int sayi=245;
        String strrakam=String.valueOf(sayi);
        int rakam=Integer.parseInt(strrakam);

        //2.yöntemi kendi sınıfımı yazayım
        Utiltiy util=new Utiltiy();
        strrakam=util.getString(sayi);
        rakam=util.getInt(strrakam);

        //3.yöntem
        strrakam=Utiltiy.getString2(sayi);
        rakam=Utiltiy.getInt(strrakam);

        System.out.println("strrakam = " + strrakam);
        System.out.println("rakam = " + rakam);




    }
}
