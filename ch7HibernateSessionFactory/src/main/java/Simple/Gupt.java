package Simple;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = "simple")
@NoArgsConstructor
public class Gupt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String message;

    @ManyToOne
    @JoinColumn(name = "gua_id")
    @JsonIgnore
    private Simple simple;
}
