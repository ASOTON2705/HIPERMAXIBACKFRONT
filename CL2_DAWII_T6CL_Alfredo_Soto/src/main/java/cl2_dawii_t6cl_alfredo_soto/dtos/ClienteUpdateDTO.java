package cl2_dawii_t6cl_alfredo_soto.dtos;

import cl2_dawii_t6cl_alfredo_soto.model.TipoDocumento;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClienteUpdateDTO {

    private Long id;
    private TipoDocumento tipoDocumento;
    private String documento;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private Date fecNacimiento;
    private String email;
}
