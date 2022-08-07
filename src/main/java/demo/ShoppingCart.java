package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //Logging
        //Authentication & Authorization
        //Sanitize the Data
        System.out.println("Checking out (method from shopping cart)");
    }

    public int quantity(){
        return 2;
    }
}
