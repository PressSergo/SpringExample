package DaoSimple;

import Simple.Simple;
import Simple.Gupt;
import java.util.List;

public interface DaoSImple {
    List<Simple> findAll();
    void save(Simple simple);
    void save(Gupt simple);
    List findAllWithGupt();
}
