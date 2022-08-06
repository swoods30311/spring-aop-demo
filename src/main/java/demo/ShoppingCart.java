package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        //Logging
        //Authentication & Authorization
        //Sanitize the Data
        System.out.println("Checking out (method from shopping cart)");
    }
}
