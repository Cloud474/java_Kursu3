package MySelf.gun21ödev;
//powerOfThree isminde bir method oluşturun.
//Parametre olarak int
//Return tipi boolean
//Bir tamsayı verildiğinde,
// 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
public class soru8 {
    public static void main(String[] args) {

        int üssüsayi=3;
        System.out.println(powerofthree(üssüsayi));


    }
    public static boolean powerofthree(int sayi){
        for (int i = 0; i < sayi; i++) {
            if (i*i*i==sayi){
                return true;}
            else {

            }
        }
        return false;
    }
}
