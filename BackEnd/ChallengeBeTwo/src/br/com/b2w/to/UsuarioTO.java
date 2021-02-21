package br.com.b2w.to;

public class UsuarioTO {
	
	private int codigo;
	private String login;
	private String senha;
	private String ativo;
	private String nome;
	private String dtAdmissao;
	
	public UsuarioTO() {}
	public UsuarioTO(int codigo, String login, String senha, String ativo, String nome, String dtAdmissao) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
		this.nome = nome;
		this.dtAdmissao = dtAdmissao;
	}
	
	@Override
	public String toString() {
		return login + " " + senha + " " + ativo + " " + nome + " " + dtAdmissao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
}
