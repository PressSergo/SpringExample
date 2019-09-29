package DaoSimple;

import Simple.Gupt;
import Simple.Simple;

import java.util.List;

public interface DaoSImple {
    List<Simple> findAll();
    void save(Simple simple);
    void save(Gupt simple);
    List findAllWithGupt();
    Simple findById(long id);
    List loadWithCriteria(String firstName, String lastName);
}
