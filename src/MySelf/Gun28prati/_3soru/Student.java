package MySelf.Gun28prati._3soru;

import java.util.ArrayList;

public class Student {
    String name;
    int maxcredit;

    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersekle(Lesson ders) {

            int toplamAlinankredi = 0;
            for (Lesson l : dersleri) {
                toplamAlinankredi = toplamAlinankredi + l.credit;
            }
            System.out.println("toplamalinankredi = " + toplamAlinankredi);

            if (toplamAlinankredi + ders.credit <=maxcredit) {
                dersleri.add(ders);
                System.out.println("ders.name = " + ders.Name);
            }
            else System.out.println("Alınabilecek keri aşıldı = " +ders.Name);

        }
}