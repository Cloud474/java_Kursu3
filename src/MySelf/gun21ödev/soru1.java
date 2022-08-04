package MySelf.gun21ödev;

import java.util.Scanner;

public class soru1 {
    //Ismi **randomNum** olan bir method oluşturun.
    //Parametre olarak **int max** almalı.
    //Bu method, 0 ile max arasında random bir değer döndürmelidir.
    //Random numarayı döndürünüz
    public static void main(String[] args) {

        int randomsayi=randomNum(sayioku());
        System.out.println("randomsayi = " + randomsayi);
    }
    public static int randomNum (int sayi){
        int random=(int) (Math.random()*sayi);
        return random;
    }
    public static int sayioku (){
        Scanner oku=new Scanner(System.in);
        System.out.print("Random Sayı Giriniz = ");
        return oku.nextInt();
    }

}
