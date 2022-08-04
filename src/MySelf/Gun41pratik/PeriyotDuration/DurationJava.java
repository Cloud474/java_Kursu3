package MySelf.Gun41pratik.PeriyotDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationJava {
    public static void main(String[] args) {

        //LocalTime
        LocalTime geceYarisi=LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,3,3);
        Duration fark=Duration.between(geceYarisi,ogleVakti);

        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toHours() = " + fark.toMinutes());
        System.out.println("fark.toHours() = " + fark.toMillis());

        //LocalDateTime
        LocalDateTime from=LocalDateTime.of(2020,10,4,10,20,55);
        LocalDateTime from2=LocalDateTime.of(2020,11,15,11,45,12);

        Duration farki=Duration.between(from,from2);
        System.out.println("farki = " + farki);
        System.out.println("farki.toDays() = " + farki.toDays());
        System.out.println("farki.toHours() = " + farki.toHours());
        System.out.println("farki.toMinutes() = " + farki.toMinutes());
        System.out.println("farki.toMillis() = " + farki.toMillis());


    }
}
