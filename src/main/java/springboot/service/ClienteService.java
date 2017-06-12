package springboot.service;

import java.util.List;

import model.Cliente;

public interface ClienteService {

	void salvar(Cliente cliente);

	void atualizar(Cliente cliente);

	List<Cliente> getTodos();

	Cliente buscarById(Integer id);

	void remove(Integer id);

}
