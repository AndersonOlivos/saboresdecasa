package org.safa.saboresdecasa.DTO;

import lombok.Builder;
import lombok.Data;
import org.safa.saboresdecasa.modelos.EstadoPedido;

import java.math.BigDecimal;

@Data
@Builder
public class PedidoDTO {

    private Integer numeroComensales;
    private BigDecimal precioTotal;
    private EstadoPedido estadoPedido;
    private Integer idCliente;
    private Integer idMesa;

}
