package MySelf.Gun42pRatik.Digerİslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        // bugün dünden sonra mı
        boolean sonraMi=bugun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        // bugün dünden önce mı
        boolean onceMi=bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        // bugün dune eşit mi
        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi=bugun.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);

        int fark=bugun.compareTo(dun.minusDays(3));
        System.out.println("fark = " + fark);


    }
}
