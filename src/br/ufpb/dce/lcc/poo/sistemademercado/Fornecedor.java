package br.ufpb.dce.lcc.poo.sistemademercado;

public class Fornecedor {
	private String nome;
	private String cidade;
	private int telefone;
	private String cnpj;
	
	public Fornecedor(String nome, String cidade, int telefone, String cnpj){
		this.setNome(nome);
		this.setCidade(cidade);
		this.setTelefone(telefone);
		this.setCnpj(cnpj);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
