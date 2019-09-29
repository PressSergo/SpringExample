package DaoSImpleImpl;

import DaoSimple.DaoSImple;
import Simple.Simple;
import Simple.Gupt;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NamedQuery;
import java.util.List;

@Getter
@Setter
@Transactional
@Repository
public class DaoSimpleImpl implements DaoSImple {
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<Simple> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select s from Simple s").list();
    }

    @Override
    public void save(Simple simple) {
        sessionFactory.getCurrentSession().saveOrUpdate(simple);
    }

    @Override
    public void save(Gupt gupt) {
        sessionFactory.getCurrentSession().saveOrUpdate(gupt);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Simple> findAllWithGupt() {
        return sessionFactory.getCurrentSession().getNamedQuery("DaoSimpleAll").list();
    }
}
