package cl2_dawii_t6cl_alfredo_soto.repository;

import cl2_dawii_t6cl_alfredo_soto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
