package demo;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

<<<<<<< HEAD
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        //a method we have to run at certain points (point cuts)
        //Loggers gets called b4 the checkout method
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        //a method we have to run at certain points (point cuts)
        //Loggers gets called after the checkout method
        System.out.println("After Loggers");
=======
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
>>>>>>> fb8e3267c7dcbca0e880840b226ab7cf90925d55
    }
}
