public class Dør implements OnOff {

    private Location lokation;

    public Dør(String lokation) {
        this.lokation = lokation;
    }

    public String getLokation() {
        return lokation;
    }

    public void setLokation(String lokation) {
        this.lokation = lokation;
    }
}
