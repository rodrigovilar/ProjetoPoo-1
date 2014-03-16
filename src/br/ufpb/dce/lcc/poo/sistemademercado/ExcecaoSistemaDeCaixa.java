package br.ufpb.dce.lcc.poo.sistemademercado;

public class ExcecaoSistemaDeCaixa extends RuntimeException {

	
		private static final long serialVersionUID = 1L;
		
		public ExcecaoSistemaDeCaixa (String mensagem) {
			super(mensagem);
		}
}
