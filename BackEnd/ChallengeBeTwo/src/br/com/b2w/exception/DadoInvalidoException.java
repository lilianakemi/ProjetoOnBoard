package br.com.b2w.exception;

public class DadoInvalidoException extends Exception{

	public DadoInvalidoException() {
		super("Dado não encontrada");
	}
	
	public DadoInvalidoException(String mensagem) {
		super(mensagem);
	}
}
