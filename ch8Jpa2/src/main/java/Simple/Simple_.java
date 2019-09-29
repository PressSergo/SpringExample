package Simple;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Simple.class)
public abstract class Simple_ {

	public static volatile ListAttribute<Simple, Gupt> gupt;
	public static volatile SingularAttribute<Simple, String> name;
	public static volatile SingularAttribute<Simple, Long> id;
	public static volatile SingularAttribute<Simple, String> secondName;

	public static final String GUPT = "gupt";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String SECOND_NAME = "secondName";

}

