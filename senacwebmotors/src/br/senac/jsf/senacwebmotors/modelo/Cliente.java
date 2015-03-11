package br.senac.jsf.senacwebmotors.modelo;

public class Cliente extends Pessoa{

	private String gostosPessoais;
	private String tipoCliente; //Internacional,Gold,Platinum
	
	public String getGostosPessoais() {
		return gostosPessoais;
	}
	public void setGostosPessoais(String gostosPessoais) {
		this.gostosPessoais = gostosPessoais;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	@Override
	public String toString() {
		return "Cliente [gostosPessoais=" + gostosPessoais + ", tipoCliente="
				+ tipoCliente + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getSenha()=" + getSenha() + ", getSexo()="
				+ getSexo() + ", getDataNascimento()=" + getDataNascimento()
				+ "]";
	}
	
	
}

