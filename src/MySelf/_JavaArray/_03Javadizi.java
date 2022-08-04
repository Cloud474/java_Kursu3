package MySelf._JavaArray;

public class _03Javadizi {
    public static void main(String[] args) {
        int[] dizi = new int[100];

        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        for (int i = 0; i < dizi.length; i++)
            dizi[i] = (int) (Math.random() * 100);

        int enb=dizi[0];
        int enbindex=0;
        for (int i = 0; i < dizi.length; i++) {
            if (enb<dizi[i]){
                enb=dizi[i];
            enbindex=i;
            }
        }
        System.out.println("enb = " + enb);
        System.out.println("enbindex = " + enbindex);
    }
}