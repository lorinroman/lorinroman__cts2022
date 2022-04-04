package prototype.clase;

public class Autobuz implements MijlocTransport{

    private String numeSofer;

    public Autobuz(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public MijlocTransport copy() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                '}';
    }

}
