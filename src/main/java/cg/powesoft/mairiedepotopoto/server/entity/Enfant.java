package cg.powesoft.mairiedepotopoto.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Enfant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 70)
    private String nom;
    @Column(length = 70)
    private String prenom;
    @Column(length = 70)
    private String sexe;
    @Temporal(TemporalType.DATE)
    private Date dateNaiss;
    @Column(length = 70)
    private String lieuxNaiss;
    @Temporal(TemporalType.TIME)
    private Date heureNaiss;
    @Column(length = 70)
    private String situationMatriParent;
    @ManyToOne
    @NotNull
    private Pere pere;
    @ManyToOne
    @NotNull
    private Mere mere;
    @ManyToOne
    @NotNull
    private Usager declarant;
    @OneToOne
    private Declaration declaration;


}
