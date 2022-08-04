package MySelf.Gun39pratik.Ödev.Soru_3;



public class Apple extends Phone{

    @Override
      public void options(String memory, String screen) {
        if (memory.equalsIgnoreCase("64 GB")&& screen.equalsIgnoreCase("5.5")){
            cart.add("750$");}
        else if (memory.equalsIgnoreCase("64 GB")&& screen.equalsIgnoreCase("6.5")) {
            cart.add("850$");}
        else if (memory.equalsIgnoreCase("128 GB")&& screen.equalsIgnoreCase("5.5")) {
            cart.add("950$");}
        else if (memory.equalsIgnoreCase("128 GB")&& screen.equalsIgnoreCase("6.5")) {
            cart.add("1200$");}
    }
}
