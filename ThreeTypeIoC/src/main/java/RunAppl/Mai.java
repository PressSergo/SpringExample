package RunAppl;

import MessageFactory.MessageFactory;
import SimpleTestMultiBean.MultiBean;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mai {
    public static void main(String[] args){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load(new ClassPathResource("/simple.xml"));
        genericXmlApplicationContext.refresh();
        MessageFactory messageFactory = genericXmlApplicationContext.getBean("FactoryMessage",MessageFactory.class);
        messageFactory.getMessage();
        MultiBean multiBean = genericXmlApplicationContext.getBean("multi",MultiBean.class);
        MultiBean multiBean1 = genericXmlApplicationContext.getBean("multi",MultiBean.class);
        System.out.println(multiBean.getMessage());
        multiBean1.setMessage("hahahahhahahah");
        System.out.println(multiBean.getMessage());
    }
}
