package br.ufpb.dce.lcc.poo.sistemademercado;

public class Funcionario {
	private String nome, cpf;
	
	public Funcionario (String n, String cpf) {
		this.setNome(n);
		this.setCpf(cpf);
	}
	public Funcionario () {
		this("","");
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
