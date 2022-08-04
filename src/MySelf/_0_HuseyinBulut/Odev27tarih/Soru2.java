package MySelf._0_HuseyinBulut.Odev27tarih;

public class Soru2 {
    public static void main(String[] args) {
        //getSum() isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün
        int[] dizi={4,8,6,2,20};
        System.out.println(getSum(dizi));

    }
    public static int getSum(int[] dizi){
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];
        }
        return toplam;
    }

}
