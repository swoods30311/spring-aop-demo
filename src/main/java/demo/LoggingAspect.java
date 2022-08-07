package demo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        //a method we have to run at certain points (point cuts)
        //Loggers gets called b4 the checkout method
        //System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers w/ Arg: " + arg);
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        //a method we have to run at certain points (point cuts)
        //Loggers gets called after the checkout method
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void  afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning : " + retVal);
    }
}
