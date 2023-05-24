package cl2_dawii_t6cl_alfredo_soto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
    private Long id;

    @ManyToOne()
    @JoinColumn(name="id_tipoDoc", nullable = false)
    private TipoDocumento tipoDocumento;

    @Column(name = "num_documento", length = 50, nullable = false)
    private String documento;

    @Column(name = "nombre", length = 200, nullable = false)
    private String nombre;

    @Column(name = "ape_pat", length = 200, nullable = false)
    private String apePaterno;

    @Column(name = "ape_mat", length = 200, nullable = false)
    private String apeMaterno;

    @Column(name="fec_nacimiento", nullable = false)
    @Temporal(value= TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fecNacimiento;

    @Column(name = "email", length = 200, nullable = false)
    private String email;

    public String getTipoDocumentoString() {
        if (tipoDocumento != null) {
            return tipoDocumento.getTipo();
        }
        return null;
    }
}
