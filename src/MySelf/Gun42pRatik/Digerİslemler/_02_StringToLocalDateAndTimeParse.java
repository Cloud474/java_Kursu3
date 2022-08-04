package MySelf.Gun42pRatik.Digerİslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {

        String strDate="01 12 2020";

        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strDate,format);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(format) = " + tarih.format(format));
    }
}
