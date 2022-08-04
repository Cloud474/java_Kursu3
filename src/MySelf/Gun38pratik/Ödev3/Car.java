package MySelf.Gun38pratik.Ödev3;

public class Car implements IVehicle{
    int speed;
    int gear;

    public Car(int speed, int gear) {
        setGear(gear);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public int ChangeGear(int sayi) {
        return gear=sayi;
    }

    @Override
    public int speedUp(int sayi) {
        this.speed=getSpeed()+sayi;
        return this.speed;
    }

    @Override
    public int applyBrakes(int sayi) {
        this.speed=getSpeed()-sayi;
        return this.speed;
    }
    public void printAll(){
        System.out.println("Your current speed is " + getSpeed() + " and your gear count is " + getGear() +"!");
    }
}
