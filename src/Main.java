package src;

import src.API.Hello;

public class Main {

    private static Hello hi;

    public static void main(String... args) {
        hi = new HelloToImpl("Nax");
        hi.sayHello();
        ((HelloToImpl) hi).greed();
    }
}
