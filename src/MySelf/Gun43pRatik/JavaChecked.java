package MySelf.Gun43pRatik;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaChecked {
    public static void main(String[] args) {
        // checked ve unchecked exception

        try {
            FileInputStream file=new FileInputStream("list.text");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // bu komut dosya okuma işlemi başlatır dosyayı açar

        //dosyaAc();
        //ikinci yöntem
    }

    public static void dosyaAc() throws FileNotFoundException {
        FileInputStream file=new FileInputStream("list.text");
    }
}
