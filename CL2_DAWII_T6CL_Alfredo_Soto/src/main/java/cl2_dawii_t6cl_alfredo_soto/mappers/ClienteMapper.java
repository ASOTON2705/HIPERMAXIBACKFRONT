package cl2_dawii_t6cl_alfredo_soto.mappers;

import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteCreateDTO;
import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteDTO;
import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteUpdateDTO;
import cl2_dawii_t6cl_alfredo_soto.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClienteMapper {

    ClienteMapper instancia= Mappers.getMapper(ClienteMapper.class);

    ClienteDTO clienteAClienteDTO(Cliente cliente);
    Cliente clienteDTOACliente(ClienteDTO clienteDTO);
    Cliente clienteCreateDTOACliente(ClienteCreateDTO clienteCreateDTO);
    Cliente clienteUpdateDTOACliente(ClienteUpdateDTO clienteUpdateDTO);
    List<ClienteDTO> listaClienteAListaClienteDTO (List<Cliente> listaCliente);
}
