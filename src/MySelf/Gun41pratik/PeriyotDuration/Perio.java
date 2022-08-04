package MySelf.Gun41pratik.PeriyotDuration;

import java.time.LocalDate;
import java.time.Period;

public class Perio {
    public static void main(String[] args) {
// 2 tarih arasindaki farkı gösterir

        LocalDate dogumTarihi= LocalDate.of(1993,8,12);
        LocalDate bugun=LocalDate.now();

        Period fark= Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());


        Period period3gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);

        System.out.println("period3gun = " + period3gun);
        System.out.println("period3ay = " + period3ay);

        LocalDate kursbaslangic=LocalDate.of(2022,4,18);
        Period kurssure=Period.ofMonths(6);
        LocalDate kursbitis=kursbaslangic.plus(kurssure);
        System.out.println("kursbitis = " + kursbitis);

        System.out.println("kursbitis = " + kursbitis.getDayOfWeek());
         Period kacgunkaldi=Period.between(bugun,kursbitis);
        System.out.println("kacgunkaldi = " + kacgunkaldi);
        System.out.println("kacgunkaldi.getMonths() = " + kacgunkaldi.getMonths());
        System.out.println("kacgunkaldi.getDays() = " + kacgunkaldi.getDays());

    }
}
