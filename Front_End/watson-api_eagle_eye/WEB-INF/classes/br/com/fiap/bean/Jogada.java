package br.com.fiap.bean;

public class Jogada {
	
	private String nomeFuncionario;
	private int numeroMatricula; 
	private int totalPontuacao;
	private int totalTarefas;
	
	
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public int getTotalPontuacao() {
		return totalPontuacao;
	}
	public void setTotalPontuacao(int totalPontuacao) {
		this.totalPontuacao = totalPontuacao;
	}
	public int getTotalTarefas() {
		return totalTarefas;
	}
	public void setTotalTarefas(int totalTarefas) {
		this.totalTarefas = totalTarefas;
	}	
	
}
