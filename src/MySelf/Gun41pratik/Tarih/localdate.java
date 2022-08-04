package MySelf.Gun41pratik.Tarih;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

public class localdate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.format(DateTimeForma = " + tarih.format(DateTimeFormatter.BASIC_ISO_DATE));


        System.out.println("Short = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Short = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Short = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

        System.out.println("Germany = "
                + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        Locale[] kullanilabilirlocaller=Locale.getAvailableLocales();
        for (Locale l:kullanilabilirlocaller){
            System.out.println(l.getDisplayCountry() + " " + l);
        }

        // istedğim formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter dateformat1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("dateformat1 = " + tarih.format(dateformat1));

        DateTimeFormatter dateformat2= DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("dateformat1 = " + tarih.format(dateformat2));

        
    }
}
