package factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        MijlocTransport autobuz = factory.getMijlocTransport(TipTransport.AUTOBUZ, 12234);
        MijlocTransport troleibuz = factory.getMijlocTransport(TipTransport.TROLEIBUZ, 45444);
        MijlocTransport tramvai = factory.getMijlocTransport(TipTransport.TRAMVAI, 6778);


        System.out.println(autobuz.toString());
        System.out.println(troleibuz.toString());
        System.out.println(tramvai.toString());
    }
}
