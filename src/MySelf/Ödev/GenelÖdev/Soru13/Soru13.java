package MySelf.Ödev.GenelÖdev.Soru13;

public class Soru13 {
    public static void main(String[] args) {
        int sayi = 349;
        System.out.println("palindromeNum(sayi) = " + palindromeNum(sayi));
    }

    public static int tersi(int sayi) {
        int tersi = 0;
        while (sayi != 0) {
            int basamak = sayi % 10;
            tersi = tersi * 10 + basamak;
            sayi = sayi / 10;
        }
        return tersi;
    }

    public static boolean tersiKontorl(int sayi) {
        int tersi = tersi(sayi);
        return tersi == sayi;
    }

    public static int palindromeNum(int sayi) {
        int sayac = 0;
        if (tersiKontorl(sayi)) {
            return sayac;
        } else {
            while (!tersiKontorl(sayi)) {
                int tersi = tersi(sayi);
                sayi = sayi + tersi;
                sayac++;
            }
        }
        return sayac;
    }
}