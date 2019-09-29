package SimpleReplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mains {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application.xml");
        ReplaceTarger replaceTarger = applicationContext.getBean("replaceMethod",ReplaceTarger.class);
        ReplaceTarger replaceTarger1 = applicationContext.getBean("standart",ReplaceTarger.class);

        //replaceTarger.Message1("    ");
        replaceTarger1.Message1("   ");
    }
}
