package sem1.clase;

public abstract class Animal {
    private String nume;


    public Animal(String nume) {
        this.nume=nume;
    }

    public abstract void mananca(String tipMancare);

}
