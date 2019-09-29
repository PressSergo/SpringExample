package Simple;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "DaoSimpleAll",query = "select s from Simple s left join fetch s.gupt")
public class Simple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String name;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "simple")
    List<Gupt> gupt;
}
