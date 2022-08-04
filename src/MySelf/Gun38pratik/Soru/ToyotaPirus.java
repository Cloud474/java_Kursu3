package MySelf.Gun38pratik.Soru;

public class ToyotaPirus extends Vehicle implements IElectric, IGas{
    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo 300 km gider";
    }

    @Override
    public String drive() {
        return "Otomatic pilot active";
    }
}
