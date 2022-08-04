package MySelf.Ödev.GenelÖdev.Soru16;

public class Soru16 {
    public static void main(String[] args) {
        int[] sayilar= {1, 9, 5, 14, 2, 0, 4};
        System.out.println("toplam(sayilar) = " + toplam(sayilar));
    }
    public static int toplam(int[] sayilar){
        int caunt=0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i+1; j < sayilar.length; j++) {
                if (sayilar[j]+sayilar[i]==6)
                    caunt++;
            }
        }
        return caunt;
    }
}
