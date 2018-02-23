public class Hus {

    private Vindue[] vinduer = new Vindue[10];

    public Hus() {

        Location stue = new Location("Stuen");

        Vindue vindueSoveværelse = new Vindue();
        Vindue vindueBad = new Vindue();
        Vindue vindueStue = new Vindue();

        vinduer[1] = vindueSoveværelse;
        vinduer[2] = vindueBad;
        vinduer[3] = vindueStue;

        Dør hovedDør = new Dør();
    }
}
