package lwh.design.pattern.factory.simple;

public class Test {

    public static void main(String[] args) {
        Noodle noodle = SimpleNoodleFactory.createNoodle(SimpleNoodleFactory.TYPE_LZ);

        noodle.desc();
    }
}
