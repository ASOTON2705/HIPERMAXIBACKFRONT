package cl2_dawii_t6cl_alfredo_soto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="tb_tipo_documento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipoDoc", nullable = false)
    private Long idTipo;

    @Column(name = "des_tipoDoc", length = 200, nullable = false)
    private String tipo;
}
