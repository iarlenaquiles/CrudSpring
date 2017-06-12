package springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.UniadvException;
import model.Cliente;
import repository.ClienteRepository;
import springboot.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void salvar(Cliente cliente) throws UniadvException{
		clienteRepository.save(cliente);
	}

	@Override
	public void atualizar(Cliente cliente) {
		clienteRepository.save(cliente);

	}

	@Override
	public List<Cliente> getTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarById(Integer id) {
		return clienteRepository.findOne(id);
	} 

	@Override
	public void remove(Integer id) {
		clienteRepository.delete(id);
	}
}
