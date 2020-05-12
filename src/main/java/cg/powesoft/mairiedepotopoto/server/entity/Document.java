package cg.powesoft.mairiedepotopoto.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Transactional
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Document implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25)
    private String documentName;
    @Column(length = 250)
    private String descriptionName;
    private BigDecimal price;
    private String imageUrl;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "document")
    private Set<Declaration> declaration;
}
