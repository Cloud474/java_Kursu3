package MySelf.gun21ödev;

public class soru6 {
    //EvenOddNums isminde bir method oluşturun.
    //Bu yöntem String olan bir parametreyi kabul etsin.
    //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
    //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
    //toplam sonucu yazdırın
    public static void main(String[] args) {
        String sayilar= "12346780";

        evenOddNums(sayilar);
    }

    public static void evenOddNums(String sayilar) {
        String[] rakamlar= sayilar.split("");
        int toplam=0;
        int sayi;
        for (int i = 0; i < rakamlar.length; i++) {
            sayi=Integer.parseInt(rakamlar[i]);
            if (sayi%2==1) {
                toplam -= sayi;
            }else{
                toplam+=sayi;
            }
        }
        System.out.println( toplam);
    }
}
