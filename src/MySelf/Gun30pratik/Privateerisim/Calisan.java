package MySelf.Gun30pratik.Privateerisim;

public class Calisan {
    int id;
    String name;
    String surName;

    private String password;

    public void sifreAta(String sifre) {

        if (sifre.length() < 8)
            System.out.println("Lütfen kuralına uygun sifre giriniz");
        else {
            this.password = sifre;
            System.out.println("şifre başarıyla atandı");

        }

    }
}