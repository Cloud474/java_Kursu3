package MySelf.Gun36pratik.protocted.paket2;

import MySelf.Gun36pratik.protocted.paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String ad, String cinsi) {
        super.ad=ad;
        super.cinsi=cinsi;

    }

    @Override
    public String toString() {
        return "P2Kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}