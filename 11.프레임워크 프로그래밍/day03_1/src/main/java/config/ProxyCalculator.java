package config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget(){}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

//        Signature sig = JoinPoint]=

        long stime = System.nanoTime(); // 공통기능
      try{
          Object result = joinPoint.proceed(); //핵심 기능 대실 실행.
            return result;
      } finally {
          long etime = System.nanoTime(); // 공통 기능
          System.out.printf("걸린시간:%d%n", etime - stime);
      }
    }
}

