package MySelf.Gun41pratik.Zonedate;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonDate {
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        Set<String> zamanBölgeleri= ZoneId.getAvailableZoneIds();
        for (String z:zamanBölgeleri){
            if (z.toLowerCase().contains("stan"))
                System.out.println("z = " + z);
        }

        ZoneId zoneLON=ZoneId.of("Europe/London");
        ZonedDateTime zdtLON=ZonedDateTime.now(zoneLON);
        System.out.println("Europe/London = " + zdtLON);


    }
}
