package clase;

public class TramvaiHandler extends Handler{

    public TramvaiHandler(int prag) {
        super(prag);
    }


    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta<prag){
            System.out.println("Se deplaseaza cu tramvaiul");
        }else{
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }
}
