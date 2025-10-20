package org.safa.saboresdecasa.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "pedido", catalog = "postgres", schema = "saboresdecasa")


public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "num_comensales")
    private Integer numeroComensales;

    @Column(name = "precio_total")
    private BigDecimal precioTotal;

    @Column(name = "estado")
    @Enumerated(EnumType.ORDINAL)
    private EstadoPedido estadoPedido;

    @JoinColumn(name = "id_cliente")
    @ManyToOne
    private Cliente cliente;

    @JoinColumn(name = "id_mesa")
    @ManyToOne
    private Mesa mesa;
}
