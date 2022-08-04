package MySelf.Gun30pratik.Soru;

import java.util.Scanner;

public class Hesap {

   private int yatan=0;
   private int cekilen;
   private int bakiye;
   private int password=1234;

   public void paraEkle(int gelenPara){
      bakiye+=gelenPara;
      yatan+=gelenPara;
   }
   public void paraCek(){
      Scanner oku=new Scanner(System.in);
      System.out.print("Password = ");
      int pass=oku.nextInt();
      if (pass==password) {
         System.out.println("Giriş Başarılı");
         System.out.print("Çekmek istediğiniz tutar= ");
         int tutar=oku.nextInt();
         System.out.println("Bakiye= "+bakiye+"  Çekmek istediğiniz tutar= "+tutar);
         bakiye = bakiye - tutar;
         cekilen += tutar;

      }else System.out.println("Hatalı şifre");

      if (cekilen>bakiye)

         System.out.println("Yetersiz Bakiye");
      else System.out.println("Extre = "+"Kalan Bakiye= "+bakiye+"   çekilen tutar= "+cekilen);

   }

   @Override
   public String toString() {
      return "Hesap{" +
              "yatan=" + yatan +
              ", cekilen=" + cekilen +
              ", bakiye=" + bakiye +
              '}';
   }

}
