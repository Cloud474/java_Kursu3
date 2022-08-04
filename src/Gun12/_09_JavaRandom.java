package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Tahmin sayısı=");
        int tahmin= oku.nextInt();
        int tutulansayı= (int)Math.random()*tahmin;
        if (tahmin == tutulansayı){
            System.out.println("tebrikler");
        }
    }
}
