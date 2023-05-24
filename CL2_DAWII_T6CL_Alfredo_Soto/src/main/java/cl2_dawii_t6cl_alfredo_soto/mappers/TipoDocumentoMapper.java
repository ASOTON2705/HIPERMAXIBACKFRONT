package cl2_dawii_t6cl_alfredo_soto.mappers;

import cl2_dawii_t6cl_alfredo_soto.dtos.*;
import cl2_dawii_t6cl_alfredo_soto.model.Cliente;
import cl2_dawii_t6cl_alfredo_soto.model.TipoDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoDocumentoMapper {

    TipoDocumentoMapper instancia= Mappers.getMapper(TipoDocumentoMapper.class);

    TipoDocumentoDTO tipoDocumentoATipoDocumentoDTO(TipoDocumento tipoDocumento);
    TipoDocumento tipoDocumentoDTOATipoDocumento(TipoDocumentoDTO tipoDocumentoDTO);
    TipoDocumento tipoDocumentoCreateDTOATipoDocumento(TipoDocumentoCreateDTO tipoDocumentoCreateDTO);
    TipoDocumento tipoDocumentoUpdateDTOATipoDocumento(TipoDocumentoUpdateDTO tipoDocumentoUpdateDTO);
    List<TipoDocumentoDTO> listaTipoDocumentoAListaTipoDocumentoDTO (List<TipoDocumento> listaTipoDocumento);
}
