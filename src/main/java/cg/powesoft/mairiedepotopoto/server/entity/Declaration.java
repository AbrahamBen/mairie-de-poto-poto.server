package cg.powesoft.mairiedepotopoto.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Date;

@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Declaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;
    @ManyToOne
    private Usager usager;
    @ManyToOne
    private Document document;
    @OneToOne
    private Enfant enfant;
    private String object;
    private Date dateDeclaration;
}
