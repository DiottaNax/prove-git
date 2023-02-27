package src;

import src.API.Hello;

public class Main {

    private static Hello hi;

    public static void main(String... args) {
        hi = new HelloToImpl("merda");
        ((HelloToImpl) hi).greed();
        ((HelloToImpl) hi).greed("del");
        ((HelloToImpl) hi).greed("cristo");
    }
}
