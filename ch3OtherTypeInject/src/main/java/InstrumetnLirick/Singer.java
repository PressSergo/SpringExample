package InstrumetnLirick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("singer")
public class Singer {

    @Autowired
    private inspiration ins;

    public void sing(){
        System.out.println(ins.getMessageLyrick());
    }
}
