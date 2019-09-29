package Runs;

import UseDigistSimple.UseDigist;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runs {
    public static void main(String[] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/appl.xml");
        UseDigist useDigist = classPathXmlApplicationContext.getBean("useDigest",UseDigist.class);
        useDigist.GetIt("Simple one");
    }
}
