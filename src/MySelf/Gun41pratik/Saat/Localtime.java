package MySelf.Gun41pratik.Saat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Localtime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime saat= LocalTime.now();
        System.out.println("saat = " + saat);
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        DateTimeFormatter format1= DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat.format(format1) = " + saat.format(format1));

        DateTimeFormatter format2= DateTimeFormatter.ofPattern("kk:mm:a");
        System.out.println("saat.format(format1) = " + saat.format(format2));

        DateTimeFormatter format3= DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat.format(format1) = " + saat.format(format3));

        //canlı saat
        while (true){
            saat=LocalTime.now();
            System.out.print("\rsaat = " + saat.format(format3));
            Thread.sleep(1000);
        }
    }
}
