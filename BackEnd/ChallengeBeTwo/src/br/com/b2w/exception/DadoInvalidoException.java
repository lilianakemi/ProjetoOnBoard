package br.com.b2w.exception;

public class DadoInvalidoException extends Exception{

	public DadoInvalidoException() {
		super("Dado n�o encontrada");
	}
	
	public DadoInvalidoException(String mensagem) {
		super(mensagem);
	}
}
