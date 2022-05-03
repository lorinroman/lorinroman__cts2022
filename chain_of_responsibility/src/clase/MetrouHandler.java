package clase;

public class MetrouHandler extends Handler{


    public MetrouHandler(){
        super(0);
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta >= prag){
            System.out.println("Se deplaseaza cu metroul.");
        }
    }
}
