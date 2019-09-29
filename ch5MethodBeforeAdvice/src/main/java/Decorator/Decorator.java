package Decorator;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Decorator implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Method: "+method.getName()+"    Object: "+o.getClass());
    }
}
