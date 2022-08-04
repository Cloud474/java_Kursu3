package MySelf.Gun34Odev.Soru4;

public class Main {
    public static void main(String[] args) {
        RentApartments rentApartments=new RentApartments();
        rentApartments.setName("Victoria");
        rentApartments.setRoomCount(rentApartments.roomCount(3));
        rentApartments.setBalconyOrNo(true);
        System.out.println("**userName rent is amountOfRent**"+rentApartments.roomCount(3)+200);
        System.out.println("rentApartments = " + rentApartments);
    }

}
