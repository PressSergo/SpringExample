package Mather;

import Singer.GreatSinger;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class Mather extends StaticMethodMatcherPointcut {
    @Override
    public ClassFilter getClassFilter() {
        return cls ->(cls== GreatSinger.class);
    }

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return ("sing".equals(method.getName()));
    }
}
