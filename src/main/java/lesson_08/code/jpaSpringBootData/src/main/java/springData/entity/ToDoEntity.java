package springData.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "todo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "todoName")
    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "to_do_author_id")
    private User toDoAuthor;


    @ManyToMany
    @JoinTable(
            name = "todo_collaborates", //имя таблицы связи
            joinColumns = @JoinColumn(name = "todo_id"), //имя столбца для ToDoEntity
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> collaborate;
}
