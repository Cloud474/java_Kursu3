package MySelf.Ödev.ismetHocaödev;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<User> kullanici=new ArrayList<>();

        do {
            System.out.print("UserName = ");
            String name = oku.next();

            System.out.print("Password = ");
            int sifre = okuInt.nextInt();

            if (sifre > 6) {
                System.out.print("Password tekrar giriniz = ");
                 sifre = okuInt.nextInt();
            }
                User kullanicilar = new User(0, name, sifre, true, true);
                kullanici.add(kullanicilar);

                System.out.println("kullanicilar = " + kullanicilar);

        }
            while (kullanici.size() < 3) ;

    }
}
