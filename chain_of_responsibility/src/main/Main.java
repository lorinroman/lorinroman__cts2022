package main;

import clase.*;

public class Main {

    public static void main(String[] args) {
        AutobuzHandler autobuzHandler = new AutobuzHandler(null,5);
        TroleibuzHandler troleibuzHandler = new TroleibuzHandler(3);
        TramvaiHandler tramvaiHandler = new TramvaiHandler(10);
        MetrouHandler metrouHandler = new MetrouHandler();

        troleibuzHandler.setNextHandler(autobuzHandler);
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        troleibuzHandler.afiseazaCuCeSaMearga(4);
        troleibuzHandler.afiseazaCuCeSaMearga(23);
        troleibuzHandler.afiseazaCuCeSaMearga(8);


        Handler autobuzHCluj = new AutobuzHandler(null,3000);
        Handler tramvaiHCluj = new TramvaiHandler(8);
        Handler troleibuzHCluj = new TroleibuzHandler(3);

        troleibuzHCluj.setNextHandler(tramvaiHandler);
        tramvaiHCluj.setNextHandler(autobuzHCluj);

    }
}
