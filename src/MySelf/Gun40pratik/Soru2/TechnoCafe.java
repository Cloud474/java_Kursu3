package MySelf.Gun40pratik.Soru2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        LocalTime saat= LocalTime.now();

        ArrayList<Food> foods=new ArrayList<>();
        Scanner okuInt=new Scanner(System.in);
        int secim=0;
        do {
            Kitchen.MenuYaz();
            System.out.print("Seçiminiz = ");
             secim=okuInt.nextInt();
             Kitchen.yaz(foods,secim);
        }while (secim!= 0);
        DateTimeFormatter ozelformat2= DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("Sipariş saati = " + saat.format(ozelformat2));
        Kitchen.yazdir(foods);
        System.out.println("toplam fiyat = " + Kitchen.ucret(foods) + " TL");
    }
}
