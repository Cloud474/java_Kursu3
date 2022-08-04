package MySelf.gun21ödev;

import java.util.Scanner;

public class soru5 {
    //getSum isminde bir method oluşturun.
    //Parametresi ArrayList'tir.
    //Dizideki tüm $ ları kaldır ve tüm sayıları topla
    //return yaptğımız veri tipi 'int' olmalıdır.
    //sonuç 0'dan küçükse, -1 yazdırın.

    public static void main(String[] args) {
        String[] dizi = new String[3];
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Ücretleri Giriniz = ");
            dizi[i]= oku.nextLine();
        }
        int toplam=getsum(dizi);
        System.out.println("toplam = " + toplam+"$");

    }


    public static int getsum (String dizi[]) {
        int toplam = 0;
        for (int i = 0; i < 3; i++) {
            int para = Integer.parseInt(dizi[i].replaceAll("[^0-9-]", ""));
            toplam = toplam + para;
            if (toplam<0)
                toplam=(-1);

        }
        return toplam;


    }
}
