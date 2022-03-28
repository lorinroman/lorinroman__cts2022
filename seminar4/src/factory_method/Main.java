package factory_method;


import factory.MijlocTransport;

public class Main {

    public static void main(String[] args) {
        MijlocTransport autobuz = new FactoryAutobuz().getMijlocTransport(2234);
        MijlocTransport tramvai = new FactoryAutobuz().getMijlocTransport(234);
        MijlocTransport troleibuz = new FactoryAutobuz().getMijlocTransport(6634);

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());

    }
}
