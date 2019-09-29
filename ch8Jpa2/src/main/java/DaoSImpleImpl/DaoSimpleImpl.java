package DaoSImpleImpl;

import DaoSimple.DaoSImple;
import Simple.Gupt;
import Simple.Gupt_;
import Simple.Simple;
import Simple.Simple_;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import java.util.List;


@Getter
@Setter
@Transactional
@Repository
@Service("singerDao")
public class DaoSimpleImpl implements DaoSImple {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Simple> findAll() {
        return entityManager.createNamedQuery("loadAllNotFacth",Simple.class).getResultList();
    }

    @Override
    public void save(Simple simple) {
        if(simple.getId() == null){
            entityManager.persist(simple);
        }else{
            entityManager.merge(simple);
        }
    }

    @Override
    public void save(Gupt gupt) {
    }

    @Override
    @Transactional(readOnly = true)
    public List<Simple> findAllWithGupt() {
        return entityManager.createNamedQuery("loadWithFecth",Simple.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Simple findById(long id) {
        return entityManager.createNamedQuery("selectById",Simple.class).setParameter("id",id).getResultList().get(0);
    }

    @Override
    @Transactional(readOnly = true)
    public List loadWithCriteria(String firstName, String lastName) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Simple> criteriaQuery = criteriaBuilder.createQuery(Simple.class);
        Root<Simple> root = criteriaQuery.from(Simple.class);
        root.fetch(Simple_.gupt, JoinType.LEFT);
        criteriaQuery.select(root).distinct(true);
        return null;
    }
}
