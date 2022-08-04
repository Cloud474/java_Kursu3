package MySelf.Gun32pratik.ornek2;

public class Soru {
    public static void main(String[] args) {
        // Bir User yetkilendirme modülü yapılması isteniyor.
        // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
        // USER STATUSU : AKTIF, PASIF
        // Yukarıdaki şekilde bir USER class ı tanımlayınız
        // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
        // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
        // SILME işlemi kontrolü yapınız bir metod için.

        User use1=new User("İsmet",Rolu.AMNIN,Statu.AKTIF);
        User use2=new User("Hüseyin",Rolu.MUDUR,Statu.AKTIF);
        User use3=new User("Gülcan",Rolu.PERSONEL,Statu.PASIF);
        User use4=new User("Rümeysa",Rolu.SATIS,Statu.PASIF);
        use3.rolu=Rolu.MUDUR;
        Usersil(use1);
    }

    public static void Usersil(User user){
        if (user.rolu==Rolu.AMNIN)
            System.out.println("Admin silinemez");
    }
}
