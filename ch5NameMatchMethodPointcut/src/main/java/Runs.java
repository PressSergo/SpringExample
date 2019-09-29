import Advice.SimpleAdvice;
import Mather.Mather;
import Singer.BestSinger;
import Singer.GreatSinger;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class Runs {
    public static void main(String[] args){
        GreatSinger gs = new GreatSinger();
        BestSinger bs = new BestSinger();

        SimpleAdvice simpleAdvice = new SimpleAdvice();
        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
        nameMatchMethodPointcut.addMethodName("sing");
        Advisor advisor = new DefaultPointcutAdvisor(nameMatchMethodPointcut,simpleAdvice);

//        JdkRegexpMethodPointcut jdkRegexpMethodPointcut = new JdkRegexpMethodPointcut();
//        jdkRegexpMethodPointcut.setPattern(".*sing.*");

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(gs);

        GreatSinger gg = (GreatSinger) pf.getProxy();
        gg.sing();

        pf.setTarget(bs);
        BestSinger bb = (BestSinger) pf.getProxy();
        bb.sing();
    }
}
