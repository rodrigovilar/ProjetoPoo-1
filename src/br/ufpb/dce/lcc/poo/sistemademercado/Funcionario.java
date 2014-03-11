package br.ufpb.dce.lcc.poo.sistemademercado;

public class Funcionario {
	private String nome, cpf, funcao;
	
	public Funcionario (String n, String cpf, String funcao) {
		this.setNome(n);
		this.setCpf(cpf);
		this.setFuncao(funcao);
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
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getDescricao () {
		return "Nome: "+this.getNome()+"\nCPF: "+this.getCpf()+"\nFunção: "+this.getFuncao();
	}

}
