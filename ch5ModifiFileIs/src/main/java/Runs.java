import Advisors.IsModifiAdvisor;
import Interface.IsModified;
import Simple.SimpleObj;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Runs {
    public static void main(String[] args){
//        SimpleObj simpleObj = new SimpleObj();
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.addAdvisor(new IsModifiAdvisor());
//        proxyFactory.setOptimize(true); // используем CGLIB
//        proxyFactory.setTarget(simpleObj);
//        SimpleObj proxy = (SimpleObj) proxyFactory.getProxy();
//        IsModified isModified = (IsModified) proxy;
//        System.out.println(isModified.isModified());

        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("aopAppl.xml");
        SimpleObj simpleObj = genericXmlApplicationContext.getBean("proxyFactoryBean",SimpleObj.class);
        IsModified isModified = (IsModified) simpleObj;
        isModified.isModified();
    }
}
