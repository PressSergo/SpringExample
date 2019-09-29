import Agent.Agent;
import AgentDecorator.AgentDecorator;
import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Runs {
    public static void main(String[] args){
//        Agent agent = new Agent();
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.addAdvice(new AgentDecorator());
//        proxyFactory.setTarget(agent);
//
//        Agent pfA = (Agent)proxyFactory.getProxy();
//        pfA.speak();
//        agent.speak();

        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("aopAppl.xml");

        Agent agent = genericXmlApplicationContext.getBean("proxyFacotry",Agent.class);
        agent.speak();
    }
}
