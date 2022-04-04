package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {

    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setTextRulat("la").setOraIncepereProgram(9);

        Autobuz a1 = autobuzBuilder.build();

        autobuzBuilder.setTextRulat("ro").setOraIncepereProgram(6);

        Autobuz a2 = autobuzBuilder.build();

        System.out.println(a1);
        System.out.println(a2);

    }
}
