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
}
