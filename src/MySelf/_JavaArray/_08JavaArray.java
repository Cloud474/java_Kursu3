package MySelf._JavaArray;

public class _08JavaArray {
    public static void main(String[] args) {
        int[][] tablo1 = new int[2][3];
        int[][] tablo2 = {{23, 44, 55}, {45, 66, 77}};

        for (int satır = 0; satır < 2; satır++) {

            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.println(satır +","+sutun+"=" + tablo2[satır][sutun]);
            }
        }


        int toplam=0;
        for (int satır = 0; satır < 2; satır++) {

            for (int sutun = 0; sutun < 3; sutun++)
            {
                toplam=toplam+tablo2 [satır][sutun];
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
