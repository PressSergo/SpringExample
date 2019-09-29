import AllClasses.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Runs {
    public static void main(String[] args){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("aopAppl.xml");
        genericXmlApplicationContext.refresh();
        Singer singer = genericXmlApplicationContext.getBean("singer",Singer.class);
        singer.poy();
    }
}
