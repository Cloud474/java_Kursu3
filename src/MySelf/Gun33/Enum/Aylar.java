package MySelf.Gun33.Enum;

public enum Aylar {
    OCAK(1,31,"Ocak"),
    SUBAT(2,28,"Subat"),
    MART(3,31,"Mart"),
    NISAN(4,30,"Mart"),
    MAYIS(5,31,"Mayıs"),
    HAZIRAN(6,30,"Haziran"),
    TEMMUZ(7,31,"Temmuz"),
    AGUSTOS(8,31,"Agustos"),
    EYLUL(9,30,"Eylül"),
    EKIM(10,31,"Ekim"),
    KASIM(11,30,"Kasim"),
    ARALIK(12,31,"Aralik");

   final int ayNo;
   final int gunMiktar;
   final String isim;

    Aylar(int ayNo, int gunMiktar, String isim) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Aylar{" +
                "ayNo=" + ayNo +
                ", gunMiktar=" + gunMiktar +
                ", isim='" + isim + '\'' +
                '}';
    }
}
