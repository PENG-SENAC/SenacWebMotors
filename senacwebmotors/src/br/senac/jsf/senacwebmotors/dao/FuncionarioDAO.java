package br.senac.jsf.senacwebmotors.dao;

import java.util.Collection;
import java.util.HashMap;

import br.senac.jsf.senacwebmotors.modelo.Funcionario;

public class FuncionarioDAO {
	
	private static HashMap<Long, Funcionario> funcionarios =
			new HashMap<Long, Funcionario>();
	
	public Funcionario grava(Funcionario funcionario) {
		
		funcionario.setId(funcionarios.size()+1);
				
		funcionarios.put(funcionario.getId(),funcionario);
	
		return funcionario;
	}
	
	public Collection<Funcionario> lista() {
		return funcionarios.values();
	}

}
