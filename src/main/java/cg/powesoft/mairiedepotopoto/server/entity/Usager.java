package cg.powesoft.mairiedepotopoto.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usager implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String usagerName;
    @Column(length = 25)
    private String usagerFirstName;
    @ManyToOne
    private Nationalite nationalite;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "usager")
    private Set<Declaration > declarations;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "declarant")
    private Set<Enfant>enfants;

}
