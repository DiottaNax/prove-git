package src;

import src.API.Hello;

public class HelloJava implements Hello {
    
    @Override
    public void sayHello() {
        Hello.greetWorld();
        System.out.println("But also Hello Java!");
    }
}
