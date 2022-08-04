package MySelf.Gun38pratik.Ödev4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Amazon amazon=new Amazon();
        Costco costco=new Costco();
        Scanner oku=new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter the amount of item you want to purchase from Amazon= ");
            int butce= oku.nextInt();
            amazon.isFreeShipping(butce);}
        System.out.println("Free Delivery Status");
        System.out.println("-----------------------");
        System.out.println("****Total amount= " + amazon.getTotal());

        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter the amount of item you want to purchase from Costco= ");
            int butce= oku.nextInt();
            costco.isFreeShipping(butce);}
        System.out.println("Free Delivery Status");
        System.out.println("-----------------------");
        System.out.println("****Total amount= " + costco.getTotal());

    }
}
