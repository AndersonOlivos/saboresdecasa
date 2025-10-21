package org.safa.saboresdecasa.DTO;

import lombok.Builder;
import lombok.Data;
import org.safa.saboresdecasa.modelos.SubtipoProducto;
import org.safa.saboresdecasa.modelos.TipoProducto;

import java.math.BigDecimal;

@Data
@Builder
public class ProductoDTO {
    private String nombre;
    private String ingredientes;
    private BigDecimal precio;
    private TipoProducto tipo;
    private SubtipoProducto subtipo;
}
