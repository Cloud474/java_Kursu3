package MySelf.Gun38pratik.Soru;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo ile 100 km gider";
    }

    @Override
    public String drive() {
        return "Telefonla konuşma";
    }
}
