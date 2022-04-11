package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<Integer,Linie> linieMap;

    public FlyweightFactory() {
        this.linieMap = new HashMap<>();
    }

    public Linie getLinie(Integer nrLinie){

        Linie linie = linieMap.get(nrLinie);
        if(linie != null){
            return linie;
        }
        else{
            linie = new Linie(nrLinie, "Prima statie", "Ultima statie");
            linieMap.put(nrLinie,linie);
            return linie;
        }

    }

}
