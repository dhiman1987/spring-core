package com.dexter.my.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspects {
	
	@Before("execution(public * com.dexter.my.aop.MyAop.*(..))")
	public void beforeExecutions(final JoinPoint joinPoint) {
		System.out.println("====================== BEFORE ============================");
		System.out.println("Class name : "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Signature : "+joinPoint.getSignature().getName());
		System.out.println("========================= END ============================");
	}
	
	@AfterReturning(pointcut="execution(public * com.dexter.my.aop.MyAop.*(..))", returning="retval")
	public void afterReturning(final JoinPoint joinPoint, Object retval) {
		System.out.println("====================== AFTER RETURNING ===================");
		System.out.println("Class name : "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Signature : "+joinPoint.getSignature().getName());
		System.out.println("Returned value : "+retval);
		System.out.println("========================= END ============================");
	}
	
	@AfterThrowing(pointcut="execution(public * com.dexter.my.aop.MyAop.*(..))", throwing="exception")
	public void afterThrowing(final JoinPoint joinPoint, Exception exception) {
		System.out.println("====================== AFTER THROWING ====================");
		System.out.println("Class name : "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Signature : "+joinPoint.getSignature().getName());
		System.out.println("Exception thrown : "+exception.getMessage());
		System.out.println("========================= END ============================");
	}
	
	@After("myPointCut()")
	public void afterAdvice(final JoinPoint joinPoint){
		System.out.println("===================== AFTER ==================");
		System.out.println("Class name : "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Signature : "+joinPoint.getSignature().getName());
		System.out.println("========================= END ============================");
	}
	
	@Pointcut("execution(public * com.dexter.my.aop.MyAop.*(..))")
	public void myPointCut() {}
	
	@Around("execution(public * com.dexter.my.aop.MyAop.*(..))")
	public Object arround(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("==================== ARROUND =================");
		System.out.println("Class name : "+proceedingJoinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Signature : "+proceedingJoinPoint.getSignature().getName());
		System.out.print("Arguments : ");
		for(Object arg : proceedingJoinPoint.getArgs()) {
			System.out.println("\t"+arg);
			if(arg instanceof String) {
				if(((String) arg).contains("nonsense")) {
					return "Content is modified";
				}
			}
		}
		System.out.println("========================= END ============================");
		return proceedingJoinPoint.proceed();
		
	}

}
