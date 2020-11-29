package phani.springframework.springdatajpapagination.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
