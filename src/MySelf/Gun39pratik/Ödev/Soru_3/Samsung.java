package MySelf.Gun39pratik.Ödev.Soru_3;

import java.util.ArrayList;

public class Samsung extends Phone{
    @Override
    public void options(String memory, String screen) {
        if (memory.contains("256 GB")&& screen.contains("5.5")){
            cart.add("1000$");}
        else if (memory.equalsIgnoreCase("256 GB")&& screen.equalsIgnoreCase("7.5")) {
            cart.add("1200$");}
        else if (memory.equalsIgnoreCase("512 GB")&& screen.equalsIgnoreCase("5.5")) {
            cart.add("1300$");}
        else if (memory.equalsIgnoreCase("512 GB")&& screen.equalsIgnoreCase("6.5")) {
            cart.add("1400$");}
    }
}
