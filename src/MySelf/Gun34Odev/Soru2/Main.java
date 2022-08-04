package MySelf.Gun34Odev.Soru2;

public class Main {
    public static void main(String[] args) {

        Employess employess=new Employess("Fernando",80000,"11/23/2000");
        employess.ageCalculator(2000);
        if (employess.ageCalculator(2000)>18)
            System.out.println("**Welcome to our company Fernando your salary is 80000.**");
        if (employess.ageCalculator(2000)<18)
            System.out.println("**come back when you are 18 years old.** ");
        if (employess.ageCalculator(2000)==18)
            System.out.println("**we can have inter with you after that you can have a 80000 salary**");
    }
}
