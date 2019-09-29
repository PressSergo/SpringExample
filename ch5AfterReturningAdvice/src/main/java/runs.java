import Decorator.Decorator;
import SingerImpl.SomthingMuser;
import org.springframework.aop.framework.ProxyFactory;

public class runs {
    public static void main(String[] args){
        SomthingMuser somthingMuser = new SomthingMuser();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new Decorator());
        pf.setTarget(somthingMuser);

        SomthingMuser j = (SomthingMuser) pf.getProxy();

        j.sing();
    }
}
