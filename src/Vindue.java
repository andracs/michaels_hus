public class Vindue implements OnOff {

    private Location lokation;

    public Vindue(String lokation) {
        this.lokation = lokation;
    }

    public String getLokation() {
        return lokation;
    }

    public void setLokation(String lokation) {
        this.lokation = lokation;
    }
}
