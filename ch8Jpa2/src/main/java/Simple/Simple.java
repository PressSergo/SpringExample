package Simple;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(exclude = "gupt")
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "loadAllNotFacth", query = "select s from Simple s"),
        @NamedQuery(name = "loadWithFecth", query = "select distinct s from Simple s left join fetch s.gupt"),
        @NamedQuery(name = "selectById",query = "select distinct s from Simple s left join fetch s.gupt" +
                " where s.id= :id")
})
public class Simple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String secondName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "simple")
    List<Gupt> gupt;
}
