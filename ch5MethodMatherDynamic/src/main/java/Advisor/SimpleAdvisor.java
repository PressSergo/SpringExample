package Advisor;

import Foo.Foo;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleAdvisor extends DynamicMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        System.out.println("Dynamic Check: "+method.getName());
        int x = ((Integer)objects[0]).intValue();
        return (x>=100);
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("Static Check: "+method.getName());
        return ("foo".equals(method.getName()));
    }

    @Override
    public ClassFilter getClassFilter() {
        return cls->(cls==Foo.class);
    }
}
