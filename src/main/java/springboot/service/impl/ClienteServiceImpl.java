package springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cliente;
import repository.ClienteRepository;
import springboot.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void salvar(Cliente cliente) {

	}

	@Override
	public void atualizar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarById(Integer id) {
		return clienteRepository.findById(id);
	} 

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub

	}

}
