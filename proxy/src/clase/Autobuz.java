package clase;

public class Autobuz implements MijlocTransport{

    private String nrAutobuz;
    private int nrCalatori;

    public Autobuz(String nrAutobuz, int nrCalatori) {
        this.nrAutobuz = nrAutobuz;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opreste() {
        System.out.println("Autobuzul nr " + nrAutobuz + " a oprit in statie cu " + nrCalatori + " calatori.");
    }
}
