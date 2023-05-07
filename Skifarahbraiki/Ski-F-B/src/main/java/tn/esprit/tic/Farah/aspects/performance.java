package tn.esprit.tic.Farah.aspects;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Slf4j
public class performance {
    @Around("execution(public * tn.esprit.tic.Farah.Services.*.*(..))")
    public void inMethod(ProceedingJoinPoint jp) throws Throwable {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        jp.proceed();
        log.info("execution time of {] is {} ",jp.getSignature().getName(),stopwatch.getTotalTimeMillis());
                
    }
}
