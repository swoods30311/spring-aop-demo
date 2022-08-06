package demo;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout())")
    public void beforeLogger(){
        //a method we have to run at certain points (point cuts)
        //Loggers gets called b4 the checkout method
        System.out.println("Logger");
    }

    @After("execution(* *.*.checkout())")
    public void afterLogger(){
        //a method we have to run at certain points (point cuts)
        //Loggers gets called after the checkout method
        System.out.println("After Logger");
    }
}
