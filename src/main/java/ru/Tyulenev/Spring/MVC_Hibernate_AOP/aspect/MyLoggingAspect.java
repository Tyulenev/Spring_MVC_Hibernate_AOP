package ru.Tyulenev.Spring.MVC_Hibernate_AOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyLoggingAspect {
    @Around("execution(* ru.Tyulenev.Spring.MVC_Hibernate_AOP.DAO.*.*(..))")
    public Object aroundAllRepositoryMethAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature)  proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();

        System.out.println("Begin of "+ methodName);

        Object targetMethResult = proceedingJoinPoint.proceed();
        System.out.println("End of " + methodName);
        return targetMethResult;
    }
}
