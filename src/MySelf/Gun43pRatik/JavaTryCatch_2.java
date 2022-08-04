package MySelf.Gun43pRatik;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

public class JavaTryCatch_2 {
    public static void main(String[] args) {
        String str="";
        int a=5;
        int b=0;
        int c=0;

        try {
            // Catch bloklarında hangi hata önce geliyorsa ona uygun hata adı yazılır,
            // genel Eception en sona yazılır.

            char ilharf = str.charAt(0);// hata olduğu anda devamı çalışmaz uygun catch e gider
            System.out.println("ilk adım");
            c = a / b;
            System.out.println("ikinci adım");
        }catch (ExceptionInInitializerError hata){
            System.out.println("kelime boş olduğu için harf almadı");
        }
        catch (ArithmeticException hata){// burada özel hata ismi yazılırsa; ilgili hata gelirse catch kısmı çalışır
            // ilgili hatanın dışında başka hata gelirse bunun için başka bölüm olmadığından program kırlır.

            System.out.println("sayı sıfıra bölünemez");
        }
        catch (Exception hata){// hangi hata olursa olsun hata olduğunda exception catch çalışr. default gibi
            System.out.println(hata.getMessage());
        }

    }
}
