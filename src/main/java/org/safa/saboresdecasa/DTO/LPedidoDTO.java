package org.safa.saboresdecasa.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LPedidoDTO {
    private Integer cantidad;
    private Integer idPedido;
    private Integer idProducto;
}

