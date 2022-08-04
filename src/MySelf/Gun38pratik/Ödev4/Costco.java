package MySelf.Gun38pratik.Ödev4;

public class Costco implements IDeliveryOptions {
    public int getTotal() {
        String sayi = "$3K";
        String sayi2 = "$200";
        String sayi3 = "$1K";
        int toplam = 0;

        int rakam = Integer.parseInt(sayi.replaceAll("[^0-9]", "")) * 1000;
        int rakam2 = Integer.parseInt(sayi2.replaceAll("[^0-9]", ""));
        int rakam3 = Integer.parseInt(sayi3.replaceAll("[^0-9]", "")) * 1000;
        toplam = +rakam + rakam2 + rakam3;
        System.out.println(toplam);
        return toplam;
    }
    public void isFreeShipping(int toplam){
        int ihtiyac=getTotal()-toplam;
        if (toplam>AmazonMinFreeDelivery){
            System.out.println("you are eligible for free delivery");}
        else if (AmazonMinFreeDelivery>toplam) {
            System.out.println("you need to buy "+ ihtiyac +" $"+ " amount of item.");}
    }
}