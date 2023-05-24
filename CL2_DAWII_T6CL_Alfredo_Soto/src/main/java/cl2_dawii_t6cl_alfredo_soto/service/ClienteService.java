package cl2_dawii_t6cl_alfredo_soto.service;

import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteCreateDTO;
import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteDTO;
import cl2_dawii_t6cl_alfredo_soto.dtos.ClienteUpdateDTO;

import java.util.List;

public interface ClienteService {

    List<ClienteDTO> listarClientes();
    ClienteDTO obtenerClientePorID(long id);
    ClienteDTO registrarCliente(ClienteCreateDTO clienteCreateDTO);
    ClienteDTO actualizarCliente(ClienteUpdateDTO clienteUpdateDTO);
    ClienteDTO eliminarCliente(long id);
}
