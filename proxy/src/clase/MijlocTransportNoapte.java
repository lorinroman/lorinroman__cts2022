package clase;

public class MijlocTransportNoapte implements MijlocTransport{

    private MijlocTransport mijlocTransport;

    public MijlocTransportNoapte(MijlocTransport mijlocTransport) {
        super();
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opreste() {
        if(mijlocTransport.getNrCalatori() <= 0) {
            System.out.println("Autobuzul de noapte nu a oprit in statie.");

        }

    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }
}
