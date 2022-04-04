package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {

    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Alex").setDeschideUsile(false);
        Autobuz autobuz = autobuzBuilder.build();

        Autobuz autobuz2 = new AutobuzBuilder().setNumeSofer("Ion").setNrLinie(2).build();

        System.out.println(autobuz);
        System.out.println(autobuz2);


    }
}
