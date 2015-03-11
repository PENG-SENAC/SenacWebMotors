package br.senac.jsf.senacwebmotors.managedBean;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;

import br.senac.jsf.senacwebmotors.dao.ClienteDAO;
import br.senac.jsf.senacwebmotors.modelo.Cliente;
import br.senac.jsf.senacwebmotors.modelo.Sexo;

@ManagedBean
public class ClienteMB {

	private Cliente cliente;
	
	private ClienteDAO clienteDAO;

	private Sexo sexos = Sexo.naoInformado;
	
	public ClienteMB() {
		System.out.println("passou no contutor do " + this.getClass().getSimpleName());
	}
		
	@PostConstruct
	public void inicializa() {
		System.out.println("passou no PostContruct do " + this.getClass().getSimpleName());
		cliente = new Cliente();
		clienteDAO = new ClienteDAO();
		System.out.println("o estado atual do cliente neste MB é " + cliente);
	}

	@PreDestroy
	public void liberaRecursos() {		
		System.out.println("passou no PreDestrouy do " + this.getClass().getSimpleName());
		System.out.println("o estado atual do cliente neste MB é " + cliente);
	}
	
	public Cliente getCliente() {
		System.out.println("passou no getCliente()" + cliente);
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		System.out.println("passou no setCliente(): " + cliente);
		this.cliente = cliente;
	}
	
	public String grava() {
		System.out.println("Vai gravar o cliente no banco: " + cliente);
		clienteDAO.grava(cliente);
		System.out.println("Gravou o cliente no banco: " + cliente);
		return null;
	}
	
	public Collection<Cliente> getLista() {
		Collection<Cliente> lista = clienteDAO.lista(); 
		System.out.println("passou no getLista()" + lista);
		return lista;
	}
	
	public Collection<String> getTiposClientes() {
		Collection<String> lista = new ArrayList<String>();
		lista.add("");
		lista.add("Internacional");
		lista.add("Gold");
		lista.add("Platinum");  
		System.out.println("passou no getTiposClientes()" + lista);
		return lista;
	}

	public Sexo[] getSexos() {		
		System.out.println("passou no getSexos()" + sexos.getClass().getEnumConstants());
		return this.sexos.getClass().getEnumConstants();
	}

	public void setSexos(Sexo[] sexos) { 
		System.out.println("passou no setSexos()" + sexos);		
	}
	
}
