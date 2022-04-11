package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {

    protected List<ICalator> calatori;

    public MijlocDeTransport() {
        this.calatori = new ArrayList<>();
    }


    public void adaugaCalator(ICalator calator){
        calatori.add(calator);
    }

    public void stergeCalator(ICalator calator){
        calatori.remove(calator);
    }

    public abstract void anuntaCalatori();

}
