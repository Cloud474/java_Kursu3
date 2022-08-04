package MySelf.Gun38pratik.Ödev3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(40, 5);
        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);
        System.out.println("****Lütfen araç tipini seçiniz****");
        System.out.print("Bisiklet için \n1-Bisiklet \n2-Araba\n3-exit");
        System.out.println();
        System.out.print("Seçiminiz =");
        String secim = oku.nextLine();
        if (secim.equalsIgnoreCase("3")) {
            System.out.println("Tekrar bekleriz");
        }
        while (secim.equalsIgnoreCase("1")) {
            bicycle.printAll();
            System.out.print("Ne yapmak istiyorsunuz ? \n 1-Hız \n 2-Vites \n 3- Fren sistemi");
            System.out.println();
            System.out.print("Seçiminiz =");
            String degisiklik = oku.nextLine();
            if (degisiklik.equalsIgnoreCase("1")) {
                System.out.print("Yeni Limitinizi Giriniz =");
                int hiz = okuint.nextInt();
                bicycle.speedUp(hiz);
                System.out.println("Hızınız değiştirilmiştir. Yeni hızınız =" + hiz);
            }
            if (degisiklik.equalsIgnoreCase("2")) {
                System.out.print("Yeni Vites sayısı Giriniz =");
                int sayi = okuint.nextInt();
                bicycle.ChangeGear(sayi);
                System.out.println("Vitessiniz değiştirilmiştir. Yeni Vites sayınız =" + sayi);
            }
            if (degisiklik.equalsIgnoreCase("3")) {
                System.out.print("Yeni Hız Limiti Giriniz =");
                int fren = okuint.nextInt();
                bicycle.applyBrakes(fren);
                System.out.println("Yeni Hız Limitiniz belirlendi =" + fren);
            }
            System.out.println("İyi Günler diler Tekrar Bekleriz");break;
        }

        Car car = new Car(120, 6);
        while (secim.equalsIgnoreCase("2")) {
            car.printAll();
            System.out.println("Ne yapmak istiyorsunuz ? \n 1-Hız \n 2-Vites \n 3- Fren sistemi");
            System.out.print("Seçiminiz =");
            String degisiklik = oku.nextLine();
            if (degisiklik.equalsIgnoreCase("1")) {
                System.out.print("Yeni Limitinizi Giriniz =");
                int hiz = okuint.nextInt();
                bicycle.speedUp(hiz);
                System.out.println("Hızınız değiştirilmiştir. Yeni hızınız =" + hiz);
            }
            if (degisiklik.equalsIgnoreCase("2")) {
                System.out.print("Yeni Vites sayısı Giriniz =");
                int sayi = okuint.nextInt();
                bicycle.ChangeGear(sayi);
                System.out.println("Vitessiniz değiştirilmiştir. Yeni Vites sayınız =" + sayi);
            }
            if (degisiklik.equalsIgnoreCase("3")) {
                System.out.print("Yeni Hız Limiti Giriniz =");
                int fren = okuint.nextInt();
                bicycle.applyBrakes(fren);
                System.out.println("Yeni Hız Limitiniz belirlendi =" + fren);
            }
            System.out.println("İyi Günler diler Tekrar Bekleriz");break;
        }
    }
}
