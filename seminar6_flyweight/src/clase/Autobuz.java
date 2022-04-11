package clase;

public class Autobuz implements AutobuzLinie{

    private String name;
    private Integer an;
    private Integer nrLocuri;


    public Autobuz(String name, Integer an, Integer nrLocuri) {
        this.name = name;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriereAutobuz(Linie linie) {
        System.out.println("Linie " + linie.toString() + "Autobuz: " + this.toString());
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "name='" + name + '\'' +
                ", an=" + an +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
