package SimpleReplace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class formatReplacerMessage implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        String msg = (String) objects[0];
        System.out.println("it is override method for Spring "+msg);
        return null;
    }
}
