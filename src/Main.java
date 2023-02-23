package src;

import src.API.Hello;

public class Main {

    private static Hello hi;

    public static void main(String... args) {
        hi = new HelloToImpl("Nax");
        ((HelloToImpl) hi).greed();
        ((HelloToImpl) hi).greed("Astro");
        ((HelloToImpl) hi).greed("Diotta");
    }
}
