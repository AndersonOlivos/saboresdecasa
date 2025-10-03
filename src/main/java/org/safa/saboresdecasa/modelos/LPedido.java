package org.safa.saboresdecasa.modelos;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "lpedido", catalog = "postgres", schema = "saboresdecasa")

public class LPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @JoinColumn(name = "id_pedido")
    @ManyToOne
    private Pedido pedido;

    @JoinColumn(name = "id_producto")
    @ManyToOne
    private Producto producto;

    /*

    EJEMPLO DE MANY TO MANY (TABLA N:M SIN ATRIBUTOS)

    @ManyToMany
    @JoinTable(
        name="planta_acuario", catalog = "postgres", schema = "saboresdecasa",
        joinColumns = {
            @JoinColumn(name = "id_acuario", nullable = false)
        },
        inverseJoinColumns = {
            @JoinColumn(name = "id_planta", nullable = false)
        }
    )

     */

}
