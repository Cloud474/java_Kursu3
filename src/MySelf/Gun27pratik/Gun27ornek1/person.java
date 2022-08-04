package MySelf.Gun27pratik.Gun27ornek1;

public class person {
    String Name;
    String Surname;
    int Age;

    public void Bilgiyazdir(){

        System.out.println("Name = " + Name);
        System.out.println("Surname = " + Surname);
        System.out.println("Age = " + Age);
    }
    public void getBirthYear(){
        System.out.println("Doğum yılı = " + (2022-Age));
    }
    public void getInitials(){
        System.out.println("Name = " + Name.toUpperCase().charAt(0)+"."+Surname.toUpperCase().charAt(0)+".");
    }
}
