package clase;

public class TroleibuzHandler extends Handler{

    public TroleibuzHandler(int prag) {
        super(prag);
    }

    public TroleibuzHandler(Handler nextHandler, int prag) {
        super(nextHandler, prag);
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta<prag){
            System.out.println("Se deplaseaza cu troleibuz");
        }else{
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }
}
