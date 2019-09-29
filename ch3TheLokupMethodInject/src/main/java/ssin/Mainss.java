package ssin;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mainss {
    public static void main(String[] args){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load(new ClassPathResource("/app-context.xml"));
        genericXmlApplicationContext.refresh();

        DemoBean abstractLokoopBean = genericXmlApplicationContext.getBean("abstractLokop",DemoBean.class);
        DemoBean standartLokoopDemoBean = genericXmlApplicationContext.getBean("standartLok",DemoBean.class);

        abstractLokoopBean.doSomthing();
        standartLokoopDemoBean.doSomthing();
    }
}
