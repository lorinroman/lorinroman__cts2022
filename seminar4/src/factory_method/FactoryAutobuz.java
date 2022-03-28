package factory_method;

import factory.Autobuz;
import factory.MijlocTransport;

public class FactoryAutobuz implements FactoryMijlocTransport{

    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
