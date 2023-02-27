package src;

import src.API.Hello;

public class Main {

    public static void main(String... args) {
        Hello.greetWorld();
        new HelloJava().sayHello();
        var hi = new HelloToImpl("Nax");
        hi.greed();
        hi.greed("Astro");
        hi.greed("Diotta");
    }
}
