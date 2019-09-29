package mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starts {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/appcont.xml");
        Forward forward = applicationContext.getBean("forward",Forward.class);
        forward.doSomething();
    }
}
