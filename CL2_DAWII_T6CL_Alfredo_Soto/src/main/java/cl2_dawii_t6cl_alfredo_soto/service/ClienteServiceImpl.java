package cl2_dawii_t6cl_alfredo_soto.service;

import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteCreateDTO;
import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteDTO;
import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteUpdateDTO;
import cl2_dawii_t6cl_alfredo_soto.mappers.ClienteMapper;
import cl2_dawii_t6cl_alfredo_soto.model.Cliente;
import cl2_dawii_t6cl_alfredo_soto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> listarClientes() {
        return ClienteMapper.instancia.listaClienteAListaClienteDTO( clienteRepository.findAll());
    }

    @Override
    public ClienteDTO obtenerClientePorID(long id) {
        Optional<Cliente> tipodocumento= clienteRepository.findById(id);
        ClienteDTO clienteDTO ;
        if(tipodocumento.isPresent()){
            clienteDTO = ClienteMapper.instancia.clienteAClienteDTO(tipodocumento.get());
        }else {
            clienteDTO=null;
        }
        return  clienteDTO;
    }

    @Override
    public ClienteDTO registrarCliente(ClienteCreateDTO tipoDocumentoCreateDTO) {
        Cliente tipodocumento=ClienteMapper.instancia.clienteCreateDTOACliente(tipoDocumentoCreateDTO);
        Cliente respuestaEntity=clienteRepository.save(tipodocumento);
        ClienteDTO respuestaDTO= ClienteMapper.instancia.clienteAClienteDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ClienteDTO actualizarCliente(ClienteUpdateDTO clienteUpdateDTO) {

        Cliente tipodocumento=ClienteMapper.instancia.clienteUpdateDTOACliente(clienteUpdateDTO);
        Cliente respuestaEntity=clienteRepository.save(tipodocumento);
        ClienteDTO respuestaDTO= ClienteMapper.instancia.clienteAClienteDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ClienteDTO eliminarCliente(long id) {
        Optional<Cliente> tipoDocumentoOptional= clienteRepository.findById(id);
        ClienteDTO clienteDTO = new ClienteDTO();
        String resultado;
        if(tipoDocumentoOptional.isPresent()){
            clienteDTO=ClienteMapper.instancia.clienteAClienteDTO(tipoDocumentoOptional.get());
            clienteRepository.delete(tipoDocumentoOptional.get());
            return clienteDTO;
        }else {
            return clienteDTO;
        }
    }
}
