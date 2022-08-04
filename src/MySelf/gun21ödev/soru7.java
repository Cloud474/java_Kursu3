package MySelf.gun21ödev;

import static MySelf._0_publicmain._6_publicmain.toplam;

public class soru7 {
    // addDigits isminde bir method oluşturun.
    // Parametresi int
    // Return tipi de int
    // Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
// Tek basamaklı çıktığında, döndürün{

    public static void main(String[] args) {
        int sayi=156;

        while (sayi>10){
            sayi=addDigits(sayi);
        }
        System.out.println(sayi);



    }
    public static int addDigits(int sayi){
        int toplam;
        String stringsayi=Integer.toString(sayi);
        String[] dizi=stringsayi.split("");
        int[] sayilarkumesi=new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            sayilarkumesi[i]=Integer.parseInt(dizi[i]);
        }

        return toplam(sayilarkumesi);
    }
}