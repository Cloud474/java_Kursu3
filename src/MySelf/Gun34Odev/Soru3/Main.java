package MySelf.Gun34Odev.Soru3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gold gold=new Gold("Gold");
        Silver silver=new Silver("Silver");
        Bronze bronze=new Bronze("Bronze");
        Subscribe user=new Subscribe("Victoria",true,"Gold");
        Scanner oku=new Scanner(System.in);
        menu();
        System.out.print("whichMember = ");
        int secim= oku.nextInt();

            switch (secim){
                case 1:gold.üyelik();break;
                case 2:silver.üyelik();break;
                case 3:bronze.üyelik();break;
                case 4:System.out.println("**See you when you want to be a member.");break;
            }
    }


    public static void menu(){
        System.out.println("****WhichMember please push number*****");
        System.out.println("1==> ****Gold****");
        System.out.println("2==>****Silver****");
        System.out.println("3==>****Bronze****");

    }
}
