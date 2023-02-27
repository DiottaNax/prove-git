package src;

import src.API.Hello;

public class HelloJava implements Hello {
    
    @Override
    public void sayHello() {
        System.out.println("Hello Java!");
    }
}
