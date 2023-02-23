package src;

import java.io.PrintStream;

import src.API.HelloTo;

public class HelloToImpl implements HelloTo {

    private String someone;
    private PrintStream out = new PrintStream(System.out);

    public String getSomeone() {
        return someone;
    }

    public HelloToImpl(String someone) {
        this.someone = someone;
    }

    @Override
    public void sayHello() {
        out.println("Hello World!");
    }

    @Override
    public void greed(String someone) {
        out.println("Hello " + someone + " :)");
    }

    public void greed() {
        this.greed(this.someone);
    }
    
}
