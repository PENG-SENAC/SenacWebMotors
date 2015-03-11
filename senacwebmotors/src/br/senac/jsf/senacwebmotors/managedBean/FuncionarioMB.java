package br.senac.jsf.senacwebmotors.managedBean;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.senac.jsf.senacwebmotors.dao.FuncionarioDAO;
import br.senac.jsf.senacwebmotors.modelo.Funcionario;
import br.senac.jsf.senacwebmotors.modelo.Sexo;

@ManagedBean
public class FuncionarioMB {

	private Funcionario funcionario;
	
	private FuncionarioDAO funcionarioDAO;

	private Sexo sexos = Sexo.naoInformado;
	
	public FuncionarioMB() {}
	
	
	@PostConstruct
	public void inicializa() {
		funcionario = new Funcionario();
		funcionarioDAO = new FuncionarioDAO();
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String grava() {
		System.out.println("Vai gravar o funcionario no banco: " + funcionario);
		funcionarioDAO.grava(funcionario);
		System.out.println("Gravou o funcionario no banco: " + funcionario);
		return null;
	}
	
	public Collection<Funcionario> getLista() {
		return funcionarioDAO.lista();
	}
	
	public Collection<String> getFuncoesFuncionarios() {
		Collection<String> lista = new ArrayList<String>();
		lista.add("");
		lista.add("Coordenador");
		lista.add("Professor");
		lista.add("Secretario");
		return lista;
	}


	public Sexo[] getSexos() {
		return sexos.getClass().getEnumConstants();
	}


	public void setSexos(Sexo[] sexos) {

	}
	
}
