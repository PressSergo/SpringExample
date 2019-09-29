package Mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/appl.xml");
        Singer singer = applicationContext.getBean("child",Singer.class);
        singer.Sound();
    }
}
