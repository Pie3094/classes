package classe.classi.project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "studenti_classi")
@AllArgsConstructor
@NoArgsConstructor
public class studentClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Studente studente;

    @ManyToOne
    private Classe classe;
}
