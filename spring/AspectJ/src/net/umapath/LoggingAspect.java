package net.umapath;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
 

@Aspect
public class LoggingAspect 
{

	@Pointcut("execution(* CustomerBoImpl.*(..))")
	public void CallLog()
	{
		System.out.println("6");
	}
	
	@Before("execution(* net.umapath.CustomerBo.addCustomer(..))")
	
//@Before("CallLog()")
	public void logBefore(JoinPoint joinPoint)
{
 System.out.println("7");
		System.out.println("logginG() is running!");
		System.out.println("8");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("9");
		System.out.println("******");
		System.out.println("10");
	}
 
}



/*
@Aspect
public class LoggingAspect {
 
	@After("execution(* net.umapath.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {
 
		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
 
	}
 
}*/




/*@Aspect
public class LoggingAspect {
 
   @AfterReturning(
      pointcut = "execution(* net.umapath.CustomerBo.addCustomerReturnValue(..))",
      returning= "result")
   public void logAfterReturning(JoinPoint joinPoint, Object result) {
 
	System.out.println("logAfterReturning() is running!");
	System.out.println("hijacked : " + joinPoint.getSignature().getName());
	System.out.println("Method returned value is : " + result);
	System.out.println("******");
 
   }
 

}

*/


//logAfterThrowing() 
/*@Aspect
public class LoggingAspect {
 
   @AfterThrowing(
      pointcut = "execution(* net.umapath.CustomerBo.addCustomerThrowException(..))",
      throwing= "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
 
	System.out.println("logAfterThrowing() is running!");
	System.out.println("hijacked : " + joinPoint.getSignature().getName());
	System.out.println("Exception : " + error);
	System.out.println("******");
 
    }
}
*/


/*@Aspect
public class LoggingAspect {
 
   @Around("execution(* net.umapath.CustomerBo.addCustomerAround(..))")
   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
 
	System.out.println("logAround() is running!");
	System.out.println("hijacked method : " + joinPoint.getSignature().getName());
	//System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
 
	System.out.println("Around before is running!");
	joinPoint.proceed(); //continue on the intercepted method
	System.out.println("Around after is running!");
 
	System.out.println("******");
 
   }*/
 




