package br.senac.jsf.senacwebmotors.dao;

import java.util.Collection;
import java.util.HashMap;

import br.senac.jsf.senacwebmotors.modelo.Cliente;

public class ClienteDAO {
	
	private static HashMap<Long, Cliente> clientes =
			new HashMap<Long, Cliente>();
	
	public Cliente grava(Cliente cliente) {
		
		cliente.setId(clientes.size()+1);
				
		clientes.put(cliente.getId(),cliente);
	
		return cliente;
	}
	
	public Collection<Cliente> lista() {
		return clientes.values();
	}

}
