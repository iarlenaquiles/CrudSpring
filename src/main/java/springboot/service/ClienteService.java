package springboot.service;

import java.util.List;

import exception.UniadvException;
import model.Cliente;

public interface ClienteService {

	void salvar(Cliente cliente) throws UniadvException;

	void atualizar(Cliente cliente) throws UniadvException;

	List<Cliente> getTodos();

	Cliente buscarById(Integer id);

	void remove(Integer id) throws UniadvException;

}
