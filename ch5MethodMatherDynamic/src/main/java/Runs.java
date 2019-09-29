import Advisor.SimpleAdvisor;
import Decorator.Decorator;
import Foo.Foo;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Runs {
    public static void main(String[] args){
        Foo foo = new Foo();

        Advisor advisor = new DefaultPointcutAdvisor(new SimpleAdvisor(),new Decorator());

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(foo);

        Foo foo1 = (Foo) pf.getProxy();

        foo1.bar();
        foo1.foo(43);
        foo1.foo(123);

        System.out.println("--------------------------");
        foo1.foo(43);
        foo1.foo(123);
    }
}
