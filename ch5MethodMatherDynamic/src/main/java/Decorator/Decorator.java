package Decorator;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Decorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("<== aop ");
        Object o = methodInvocation.proceed();
        System.out.println(" /aop==>");
        return o;
    }
}
