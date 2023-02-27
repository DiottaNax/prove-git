package src;

import src.API.Hello;

public class Main {

    public static void main(String... args) {
        Hello.greetWorld();
        new HelloJava().sayHello();
        var hi = new HelloToImpl("Nax");
        hi.greed();
        hi = new HelloToImpl("gioele");
        hi.greed();
        hi.greed("santi");
        hi.greed("bello");
        hi.greed("Astro");
        hi.greed("Diotta");
    }
}
