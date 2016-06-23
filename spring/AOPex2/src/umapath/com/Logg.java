package umapath.com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logg {
	//@Before("execution(public String getName())")
	@Before("execution(* get*())")
	public void LoggAdvice(){
	System.out.println("Advice Method called");
   }
	@Before("execution(* get*())")
	public void LoggSecondAdvice(){
		System.out.println(" Second Advice Method called");
	   }
	   
	   
	
	/*@Before("allGetters()")
	public void LoggAdvice(){
	System.out.println("Advice Method called");
   }*/
	/*@Before("allGetters()")
	public void LoggSecondAdvice(){
		System.out.println(" Second Advice Method called");
	   }
	*/
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	
	@Before("allCircleMethods()")
	public void LoggAdvice(JoinPoint joinPoint){
	System.out.println("Advice Method called");
   }
	
	/*@Before("args(name)")
	public void ArgumentName(String name){
		System.out.println("Argument Name");
		
	}
	*/
	
	@AfterReturning("args(name)")
	public void AfterStringRetuen(String name){
		System.out.println("AfterStringRetuen");
	}
	@AfterThrowing("args(name)")
	 public void AfterThrowingAdviser(String name){
		System.out.println("An exception is throwing");
	}
	
	
	/*
	@After("args(name)")
	public void ArgumentName(String name){
		System.out.println("Argument Name");
		
	}*/
	
	@Pointcut("within(umapath.com.Circle)")
	public void allCircleMethods(){}
	
	
}