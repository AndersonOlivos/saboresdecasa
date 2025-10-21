package org.safa.saboresdecasa.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MesaDTO {
    private Integer numero;
    private String disponible;
    private Integer numComensalesMax;
}
