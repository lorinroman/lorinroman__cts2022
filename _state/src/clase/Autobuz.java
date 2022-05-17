package clase;

public class Autobuz {

    private int nrInmatriculare;
    private Stare state;

    public Autobuz(int nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        state = null;
    }

    public void setState(Stare state) {
        this.state = state;
    }

    void pleacaInCursa(){
        if(this.state instanceof StareInCursa || this.state instanceof StareLaReparat || this.state != null){
            System.out.println("Autobuzul " + nrInmatriculare + " nu poate pleca in cursa");
        }else{
            System.out.println("Autobuzul " + nrInmatriculare + " a plecat in cursa.");
            state = new StareInCursa();
        }
    }


}
