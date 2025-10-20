package org.safa.saboresdecasa.DTO;
import lombok.Getter;
import lombok.Setter;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDTO {
    private Long id;
    private String nombre;
    private String apellidos;
    private Integer telefono;
    private String correo;
    private String contrasena;
}
