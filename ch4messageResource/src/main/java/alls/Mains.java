package alls;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Locale;

public class Mains {
    public static void main(String[] args){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load(new ClassPathResource("/appl.xml"));
        genericXmlApplicationContext.refresh();

        Locale english = Locale.ENGLISH;
        Locale german = Locale.GERMAN;

        System.out.println(genericXmlApplicationContext.getMessage("msg",null,english));
        System.out.println(genericXmlApplicationContext.getMessage("msg",null,german));


        genericXmlApplicationContext.close();
    }
}
