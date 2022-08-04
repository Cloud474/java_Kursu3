package MySelf.Gun34Odev.Soru3;

public class Subscribe {
    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
        this.name = name;
        this.doYouWanaSubscribe = doYouWanaSubscribe;
        this.whichMember = whichMember;
    }

    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWanaSubscribe=" + doYouWanaSubscribe +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }
}
