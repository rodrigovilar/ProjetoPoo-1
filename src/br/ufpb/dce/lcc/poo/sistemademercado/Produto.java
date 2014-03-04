package br.ufpb.dce.lcc.poo.sistemademercado;

public class Produto {
	private String nome;
	private int codigo;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	
	public Produto(String nome, int codigo){
		this.nome = nome;
		this.codigo = codigo;
	}

}
