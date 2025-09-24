package org.safa.saboresdecasa.modelos;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "producto", catalog = "postgres", schema = "saboresdecasa")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ingredientes")
    private String ingredientes;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "tipo")
    @Enumerated(EnumType.ORDINAL)
    private TipoProducto tipo;

    @Column(name = "subtipo")
    @Enumerated(EnumType.ORDINAL)
    private SubtipoProducto subtipo;

}
