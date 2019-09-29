package All;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mains {
    public static void main(String[] args){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("appl.xml");
        SimpleBean simpleBean = genericXmlApplicationContext.getBean("sim",SimpleBean.class);
        System.out.println(simpleBean);
    }
}
