package MySelf.Gun39pratik.Ornek1;

public class Ford extends BinekOto{
    @Override
    public String getMarka() {
        return "FORD";
    }

    @Override
    public int getUretimYili() {
        System.out.println("Üretildiği Yıl");
        return super.getUretimYili();
    }
}
