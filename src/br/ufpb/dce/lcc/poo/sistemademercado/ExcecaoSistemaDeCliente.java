package br.ufpb.dce.lcc.poo.sistemademercado;


public class ExcecaoSistemaDeCliente extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public ExcecaoSistemaDeCliente(String msn){
		super(msn);
	}

}
