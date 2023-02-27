package src;

import src.API.Hello;

public class Main {

    private static Hello hi;

    public static void main(String... args) {
        hi = new HelloToImpl("gioele");
        ((HelloToImpl) hi).greed();
        ((HelloToImpl) hi).greed("santi");
        ((HelloToImpl) hi).greed("bello");
    }
}
