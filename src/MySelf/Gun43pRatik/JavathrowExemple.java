package MySelf.Gun43pRatik;

import java.util.Scanner;

public class JavathrowExemple {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Kullanıcı adı =");
        String usurname=oku.nextLine();

        System.out.print("password giriniz =");
        String password=oku.nextLine();

        try {

        if (usurname.length()<8)
            throw new Exception("şifre 8 karakterden küçük olamaz");
        else if (password.length() > 15)
            throw new Exception("şifre 15 karakterden fazla olamaz");
        }
        catch (Exception ex){
            System.out.println("lütfen dikkat");
            System.out.println("Uyari = "+ ex.getMessage());
        }
        // log tutuluyor
        //kimler bu hatalı girişleri yapmış
        //...
        // bir çok kontrol tek yerde toplanıyor
    }
}
