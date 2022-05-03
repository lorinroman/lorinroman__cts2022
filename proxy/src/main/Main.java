package main;

import clase.Autobuz;
import clase.MijlocTransportNoapte;

public class Main {

    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("b123ABC",20);
        Autobuz a2 = new Autobuz("b342LXN",0);

        MijlocTransportNoapte mj1 = new MijlocTransportNoapte(a1);
        MijlocTransportNoapte mj2 = new MijlocTransportNoapte(a2);

        a1.opreste();
        a2.opreste();
        mj1.opreste();
        mj2.opreste();
    }
}
