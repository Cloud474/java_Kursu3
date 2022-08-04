package MySelf.Gun34Odev.Soru4;

public class RentApartments {
   private String name;
   private int roomCount;
   private boolean balconyOrNo;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRoomCount() {
      return roomCount;
   }

   public void setRoomCount(int roomCount) {
      this.roomCount = roomCount;
   }

   public boolean isBalconyOrNo() {
      return balconyOrNo;
   }

   public void setBalconyOrNo(boolean balconyOrNo) {
      this.balconyOrNo = balconyOrNo;
   }

   @Override
   public String toString() {
      return "RentApartments{" +
              "name='" + name + '\'' +
              ", roomCount=" + roomCount +
              ", balconyOrNo=" + balconyOrNo +
              '}';
   }
   public int roomCount(int rent){
      if (rent==0)
         System.out.println("rent= 1400");
      if (rent==1)
         System.out.println("rent= 1700");
      if (rent==2)
         System.out.println("rent= 2200");
      if (rent==3)
         System.out.println("rent= 2700");
      return rent;
   }
}
