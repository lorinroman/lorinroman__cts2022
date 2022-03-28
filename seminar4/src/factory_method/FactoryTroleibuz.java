package factory_method;

import factory.MijlocTransport;
import factory.Troleibuz;

public class FactoryTroleibuz implements FactoryMijlocTransport{

    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
