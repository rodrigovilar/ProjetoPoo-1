package br.ufpb.dce.lcc.poo.sistemademercado;

public class ExcecaoSistemaDeFornecedor extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcecaoSistemaDeFornecedor(String mensagem){
		super(mensagem);
	}

}
