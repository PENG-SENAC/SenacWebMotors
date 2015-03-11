package br.senac.jsf.senacwebmotors.modelo;


public class Automovel {
	
	private long id;
	private String nome;
	private int numeroDeLugares;
	private int anoModelo;
	private int anoFabricacao;
	private int potenciaMotor; // 85
	private float cilindradas; //1.0,1.4,1.5,1.5,2.0
	private String tipo; // Hatch, Sedã, SUV, Picape, Utilitário
	private String fabricante; // Fiat, Volks, Ford, GM
	private boolean ehNacional;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroDeLugares() {
		return numeroDeLugares;
	}
	public void setNumeroDeLugares(int numeroDeLugares) {
		this.numeroDeLugares = numeroDeLugares;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public float getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(float cilindradas) {
		this.cilindradas = cilindradas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public boolean isEhNacional() {
		return ehNacional;
	}
	public void setEhNacional(boolean ehNacional) {
		this.ehNacional = ehNacional;
	}
	  
}
