package MySelf.Gun35Odev;

public class Main {
    public static void main(String[] args) {
        Okul okul=new Okul("Atatürk lisesi");
        Ogrenci ogrenci1=new Ogrenci("Rümeysa","İstanbul","Cumhuriyet L.",UyeTipi.OGRENCI,290);
        Ogrenci ogrenci2=new Ogrenci("Gülcan","New Jersey","American st.",UyeTipi.OGRENCI,290);
        Calisan calisan1=new Calisan("Zehra","Budapeşte","technic hgh.",UyeTipi.CALISAN,3000);
        Calisan calisan2=new Calisan("Zeynep","Londra","London Uni.",UyeTipi.CALISAN,3100);
        okul.setOgrenciler(ogrenci1);
        okul.setOgrenciler(ogrenci2);
        okul.setCalisanlar(calisan1);
        okul.setCalisanlar(calisan2);

        System.out.println("okul = " + okul);
        okul.getOgrenciler();
        okul.getCalisanlar();



    }
}
