package org.safa.saboresdecasa.modelos;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "mesa", catalog = "postgres", schema = "saboresdecasa")

public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "disponible")
    private Boolean disponible;

    @Column(name = "num_comensales_max")
    private Integer numComensalesMax;
}
