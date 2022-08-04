package MySelf.Gun38pratik.Soru;

public class TeslaElectric extends Vehicle implements IElectric{
    public TeslaElectric(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 50 yıl gider";
    }

    @Override
    public String drive() {
        return "Otomatik pilot";
    }
}
