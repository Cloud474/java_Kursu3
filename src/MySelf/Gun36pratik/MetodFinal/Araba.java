package MySelf.Gun36pratik.MetodFinal;

public class Araba extends Tasit{
    private String renk;

    public Araba(String model, String renk) {
        super(model);
        setRenk(renk);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    public void ArabaYazdir(){
        System.out.println("renk = " + renk);
    }

   // @Override
   // public String toString() {
   //     return super.toString();
   // }                      miras alınan classtaki final olduğu için alamadık
}
