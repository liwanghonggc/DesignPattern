package lwh.design.pattern.factory.normal;

import lwh.design.pattern.factory.Noodle;

public class Test {

    public static void main(String[] args) {
        NoodleFactory gkFactory = new GKFactory();
        Noodle gkNoodle = gkFactory.createNoodle();
        gkNoodle.desc();

        NoodleFactory paoFactory = new PaoFactory();
        Noodle paoNoodle = paoFactory.createNoodle();
        paoNoodle.desc();

    }
}
