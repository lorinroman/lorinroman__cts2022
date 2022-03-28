package factory_method;

import factory.MijlocTransport;
import factory.Tramvai;

public class FactoryTramvai implements FactoryMijlocTransport{

    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }


}
