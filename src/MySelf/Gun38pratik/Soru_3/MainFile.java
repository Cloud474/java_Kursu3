package MySelf.Gun38pratik.Soru_3;

import Gun38.Soru1.ToyotaPirus;

import java.util.ArrayList;

public class MainFile {
    public static void main(String[] args) {
        TxtFile txt=new TxtFile();
        PowerPointFile power=new PowerPointFile();
        DMGFile dmg=new DMGFile();
        EXEFile exe=new EXEFile();

        ArrayList<IReadFile> readfiles=new ArrayList<>();
        readfiles.add(txt);
        readfiles.add(power);
        readfiles.add(dmg);
        readfiles.add(exe);

        for (IReadFile i: readfiles){
            System.out.println(i.getClass().getSimpleName());
            System.out.println("-------------");
            if (i instanceof TxtFile){
                System.out.println("i.close() = " + ((TxtFile)i).open());
                System.out.println("i.close() = " + ((TxtFile)i).close());
                System.out.println("i.close() = " + ((TxtFile)i).read());
                System.out.println("i.close() = " + ((TxtFile)i).save());}
            if (i instanceof PowerPointFile){
                System.out.println("i.close() = " + ((PowerPointFile)i).open());
                System.out.println("i.close() = " + ((PowerPointFile)i).close());
                System.out.println("i.close() = " + ((PowerPointFile)i).read());
                System.out.println("i.close() = " + ((PowerPointFile)i).save());}
            if (i instanceof DMGFile){
                System.out.println("i.close() = " + ((DMGFile)i).open());
                System.out.println("i.close() = " + ((DMGFile)i).close());
                System.out.println("i.close() = " + ((DMGFile)i).read());
                System.out.println("i.close() = " + ((DMGFile)i).save());}
            if (i instanceof EXEFile){
                System.out.println("i.close() = " + ((EXEFile)i).open());
                System.out.println("i.close() = " + ((EXEFile)i).close());
                System.out.println("i.close() = " + ((EXEFile)i).read());
                System.out.println("i.close() = " + ((EXEFile)i).save());}
        }
    }
}
