package MySelf.Gun31pratik.StaticModifier.Soru;

public class School {
    public static void main(String[] args) {
        // Student (id, name, surName)
        // Yukarıdaki gibi 5 öğrenci tanımlayınız.
        // Her öğrencinin takip eden bir numarası olmalı.
        // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

        Student std1=new Student("Gülcan","KURANBAEVA");
        Student std2=new Student("Rümeysa","BULUT");
        Student std3=new Student("dilan","akkuş");


        System.out.println("std1 = " + std1);
        System.out.println("std2 = " + std2);
        System.out.println("std3 = " + std3);
        System.out.println("Student.sayac = " + Student.sayac);


    }
}
