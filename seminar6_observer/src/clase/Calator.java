package clase;

public class Calator implements ICalator{

    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    public void primesteNotificare(String notificare){
        System.out.println(this.nume + ", " + notificare);
    }
}
