package MySelf.Gun32pratik.Ornek3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> sepet=new ArrayList<>();
        ArrayList<Pizza> ucret=new ArrayList<>();
        int secim=0;
        do {
            Menu();
            secim= oku.nextInt();

            switch (secim){
                case 1:Pizza ps=new Pizza(PizzaSize.SMALL);
                       sepet.add(ps);break;
                case 2:Pizza pm=new Pizza(PizzaSize.MEDIUM);
                       sepet.add(pm);break;
                case 3:Pizza pl=new Pizza(PizzaSize.LARGE);
                     sepet.add(pl);break;
                case 4:SiparisYaz(sepet,ucret);break;
            }
        }while (secim<=4);
    }

    public static void Menu(){
        System.out.println("***** PIZZA MENU *****");
        System.out.println("1- Small = 4$");
        System.out.println("2- Medium = 7$");
        System.out.println("3- Large = 11.49$");
        System.out.println("4- Isleme Al");
        System.out.println("5- Çıkış");
        System.out.print("Secim=");
    }
    public static void SiparisYaz(ArrayList<Pizza> sepet,ArrayList<Pizza> ucret){
        int smallcnt=0;
        int mediumcnt=0;
        int largecnt=0;

        for (Pizza p:sepet) {
            if (p.size == PizzaSize.SMALL) smallcnt++;
            if (p.size==PizzaSize.MEDIUM)  mediumcnt++;
            if (p.size==PizzaSize.LARGE)   largecnt++;
        }
        System.out.println("small Pizza = " + smallcnt);
        System.out.println("medium Pizza = " + mediumcnt);
        System.out.println("large Pizza = " + largecnt);
        System.out.println("Siparişiniz Alınmıştır");
        double Small=4.90;
        double Medium=7.40;
        double Large=11.30;

        for (Pizza u:ucret){
            if (u.Price==Small);
            if (u.Price==Medium);
            if (u.Price==Large);
        }
        System.out.println("Toplam ücret = "+((Small*smallcnt)+(Medium*mediumcnt)+(Large*largecnt)+"$"));
    }
}