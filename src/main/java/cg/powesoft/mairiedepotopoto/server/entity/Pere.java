package cg.powesoft.mairiedepotopoto.server.entity;

import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Transactional
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 50)
    private String prenom;
    private Date dateNaiss;
    @Column(length = 100)
    private String lieuNaiss;
    @ManyToOne
    private Nationalite nationalite;
    @Column(length = 150)
    private String domicile;
    @Column(length = 50)
    private String profession;
    private String niveauInstruction;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pere")
    private Set<Enfant> enfants;

}
