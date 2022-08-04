package MySelf.Gun40pratik.Soru1;

public abstract class Hayvan {
    private int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    private static int sayac;

     abstract void yiyecegi();
     abstract void yemekMiktari();
     abstract void gunlukUykuSuresi();
     abstract void sesi();

    public int getId() {
        return id;
    }

    public void setId() {
        this.id =++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("yiyecegi = ");  yiyecegi();
        System.out.print("yemekMiktari = ");  yemekMiktari();
        System.out.print("gunlukUykuSuresi = "); gunlukUykuSuresi();
        System.out.print("sesi = "); sesi();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
