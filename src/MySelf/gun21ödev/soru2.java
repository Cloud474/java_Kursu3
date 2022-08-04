package MySelf.gun21ödev;
public class soru2 {
    public static void main(String[] args) {
        //"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.

        String cumle= "Javayı çok seviyorum ";
        System.out.println(ortaKelime(cumle));

    }
    public static String ortaKelime (String cumlecik) {
        String ortakelime= "";
        String[] kelimeler = cumlecik.split(" ");
        for (int i = 0; i < kelimeler.length; i++) {
            if ((i+1) * 2 > kelimeler.length){
                ortakelime=kelimeler[i];
                break;
            }
        }
        System.out.println("ortakelime = " + ortakelime);
        return ortakelime;
    }
}
