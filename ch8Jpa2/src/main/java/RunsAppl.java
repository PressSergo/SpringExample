import DaoSimple.DaoSImple;
import Simple.Gupt;
import Simple.Simple;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class RunsAppl {
    public static void main(String[] args){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("appl.xml");
        DaoSImple daoSimple = genericXmlApplicationContext.getBean("singerDao",DaoSImple.class);
        Simple simple = new Simple("s1","s1.1");
        Simple simple1 = new Simple("s2","s2.2");
        Gupt gupt = new Gupt("g1");
        Gupt gupt1 = new Gupt("g2");
        simple.setGupt(new ArrayList<Gupt>(){{add(gupt);add(gupt1);}});
        gupt.setSimple(simple);
        gupt1.setSimple(simple);
        daoSimple.save(simple);
        daoSimple.save(simple1);
        List<Simple> simples = daoSimple.findAllWithGupt();
        System.out.println(simples.get(0).toString());
        System.out.println(daoSimple.findById(1).toString());
    }
}
