package MySelf.Gun27pratik.Gun27ornek1;

public class _1ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        person kisi1=new person();
        person kisi2=new person();

        kisi1.Name="Rümeysa";
        kisi1.Surname="BULUT";
        kisi1.Age=23;

        kisi2.Name="Hüseyin";
        kisi2.Surname="BULUT";
        kisi2.Age=28;
        //Kolay yazdırma işlemi bu şekilde metodu class içine yazdık...
        kisi1.Bilgiyazdir();
        System.out.println();
        kisi2.Bilgiyazdir();

        kisi1.getBirthYear();
        kisi2.getBirthYear();

        kisi1.getInitials();
        kisi2.getInitials();
    }
}
