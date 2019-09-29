package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  Long SingerId;

    private  String title;

    @Temporal(TemporalType.DATE)
    private  Date releaseDate;

    @ManyToOne
    @JoinColumn(name = "singer_id")
    private Singer singer;
}
