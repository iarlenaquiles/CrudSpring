package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	public Cliente findById(@Param("id") Integer id);
}
