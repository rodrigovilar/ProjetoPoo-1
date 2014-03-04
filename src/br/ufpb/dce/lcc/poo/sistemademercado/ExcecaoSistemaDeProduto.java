package br.ufpb.dce.lcc.poo.sistemademercado;

public class ExcecaoSistemaDeProduto extends RuntimeException{
	

	private static final long serialVersionUID = 1L;
	
	public ExcecaoSistemaDeProduto (String mensagem) {
		super(mensagem);
	}

}
