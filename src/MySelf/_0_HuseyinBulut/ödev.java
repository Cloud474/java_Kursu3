package MySelf._0_HuseyinBulut;

import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
        // 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
       // Not: 0 ve 100 dahildir.
         for (int i=0;i<=100;i++)
             if (i%2==0)
                 System.out.println("Çift sayı = " + i);

        //  // 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
         for (int j=0;j<=100;j++)
             if (j%4==0 && j%5==0)
                 System.out.println("4 ve 5'e tam bölünen sayı = " + j);

       // Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın,
       // tek girdiğinde ise döngü sonlansın.
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int k=0;k<10;k++) {
            System.out.print("Sayı Giriniz=");
            int sayi = oku.nextInt();
            if (sayi % 2 == 0)
                toplam = toplam + sayi;
            System.out.println("toplam = " + toplam);
            if (sayi%2==1)
                break;}

        // Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz
         Scanner oku1=new Scanner(System.in);
         System.out.print("Sayı Giriniz = ");
         String sayi1=oku1.nextLine();

         for (int i1=0;i1<sayi1.length();i1++) {
                 System.out.println("Girdiğiniz sayı = " + sayi1.length() +" basamak");
                 break;}

        // Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz
          Scanner oku2=new Scanner(System.in);
          System.out.print("Sayı Giriniz = ");
          int sayi2= oku2.nextInt();
          int ilkbasamak=sayi2%10;
          int sonbasamak=0;
        while (sayi2>9)
        {sayi2=sayi2/10;}
        sonbasamak=sayi2;
        System.out.println("ilkBasamak = " + ilkbasamak);
        System.out.println("sonBasamak = " + sonbasamak);
        if (ilkbasamak == sonbasamak)
            System.out.println("Eşit");
        else
            System.out.println("Eşit Değil");

         // Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz
       Scanner oku3=new Scanner(System.in);
       System.out.print("Sayı Giriniz = ");
      long sayi3= oku.nextInt();
      long tersSayi=0;
      while (sayi3>0){
          long basamak=sayi3%10;
          tersSayi=tersSayi*10+basamak;
          sayi3=sayi3/10;
      }
        System.out.println("tersSayi = " + tersSayi);



        // Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)
       Scanner oku4 = new Scanner(System.in);
       System.out.print("Cümle Giriniz = ");
       String cümle1 = oku4.nextLine();
       int miktar=0;
       for (int i2=0;i2<cümle1.length();i2++) {
           if (cümle1.charAt(i2) == 'a')
               miktar ++;}
           System.out.println("a harfi sayısı = " + miktar);



         //Girilen bir cümledeki kelime sayısını bulunuz.
         Scanner text7=new Scanner(System.in);
         System.out.print("Cümle Giriniz = ");
         String cumle7=text7.nextLine();
         int miktar2=0;
         for (int i7=0;i7<cumle7.length();i7++){
             if (cumle7.charAt(i7)==' ')
                 miktar2++;
         }
        System.out.println("Kelime sayısı = " + (miktar2+1));


        // Girilen bir cümledeki kelimelerin baş harflarini yazdırınız.
         Scanner text=new Scanner(System.in);
         System.out.print("Cümle Giriniz = ");
         String cumle=text.nextLine();
        System.out.println(cumle.charAt(0));
         for (int j9=0;j9<cumle.length();j9++){
             if (cumle.charAt(j9)==' ')
                 System.out.println(cumle.charAt(j9+1));
         }

        // Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.
        Scanner ok8=new Scanner(System.in);

        int sonraki=0;
        for(int i8=0;i8<10;i8++){
            System.out.print("Sayı giriniz=");
            int sayi8=oku.nextInt();
            if (sonraki > sayi8)
                break;
            sonraki=sayi8;
        }

    }
}
