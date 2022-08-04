package MySelf.gun21ödev;

import java.util.Arrays;

public class soru9 {
    //Write a method called append
    //append adında bir method oluşturun.
    //Parametre olarak iki int array  oluşturun.
    // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
    public static void main(String[] args) {
        int [] dizi={1,2,3,4,5,6};
        int [] dizi2={7,8,9,0};
        int [] yeniarray=calledappened(dizi,dizi2);

        System.out.println("dizi2 = " + Arrays.toString(yeniarray));

    }
    public static int[] calledappened(int[] dizi, int[] dizi2){

        int[] array=new int[dizi.length+dizi2.length];
        for (int i = 0; i < array.length; i++) {
           if (i<dizi.length){
               array[i]=dizi[i];}
            else {
                array[i]=dizi2[i-dizi.length];}

        }
        return array;
    }

}
