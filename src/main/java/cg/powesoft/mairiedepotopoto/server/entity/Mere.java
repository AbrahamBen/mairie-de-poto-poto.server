package cg.powesoft.mairiedepotopoto.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Transactional
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaiss;
    private String lieuNaiss;
    @ManyToOne
    private Nationalite nationalite;
    private String domicile;
    private String profession;
    private String niveauInstruction;
    private String imagePieceIdentite;
    @OneToMany(mappedBy = "mere",cascade = CascadeType.ALL)
    private Set<Enfant> enfants;

}
