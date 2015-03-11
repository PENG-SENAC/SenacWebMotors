package br.senac.jsf.senacwebmotors.modelo;

public class Funcionario extends Pessoa{
	
	private String funcao;
	private String curriculo;
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	@Override
	public String toString() {
		return "Funcionario [funcao=" + funcao + ", curriculo=" + curriculo
				+ ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getSenha()=" + getSenha() + ", getSexo()=" + getSexo()
				+ ", getDataNascimento()=" + getDataNascimento() + "]";
	}
	
	
	

}
