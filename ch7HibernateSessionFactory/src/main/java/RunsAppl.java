import DaoSimple.DaoSImple;
import Simple.Simple;
import Simple.Gupt;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunsAppl {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("appl.xml");
        DaoSImple daoSimple = genericXmlApplicationContext.getBean("singerDao",DaoSImple.class);
        Simple simple = new Simple("s1");
        Gupt gupt = new Gupt("g1");
        Gupt gupt1 = new Gupt("g2");
        simple.setGupt(new ArrayList<Gupt>(){{add(gupt);add(gupt1);}});
        gupt.setSimple(simple);
        gupt1.setSimple(simple);
        daoSimple.save(simple);

        Simple simple1 = new Simple("s2");
        Gupt gupt2 = new Gupt("g2");
        simple1.setGupt(new ArrayList<Gupt>(){{
            add(gupt2);
        }});
        daoSimple.save(simple1);


        List<Simple> simples = daoSimple.findAllWithGupt();
        System.out.println(simples.get(0).toString());
        System.out.println(simples.get(0).getGupt().get(0).toString());

        //TODO создавать файлик json и сохранять туда информацию об объекте
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileOutputStream("data.json"),simples);
    }
}
