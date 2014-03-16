package br.ufpb.dce.lcc.poo.sistemademercado;


import java.util.LinkedList;
import java.util.List;

public class GerenteDeCaixa {
	private List <CaixaDiario> diarias;
	
	public GerenteDeCaixa(){
		this.diarias = new  LinkedList<CaixaDiario> ();
	}
	public void registrar(String data){
		for(CaixaDiario c: this.diarias){
			if(c.getData().equals(data)){
				throw new ExcecaoSistemaDeCaixa ("Caixa já existe!");
			}
		}
		
		CaixaDiario diar = new CaixaDiario(data);
		this.diarias.add(diar);
	}
	public CaixaDiario pesquisaDiaria(String data) {
		for (CaixaDiario c: this.diarias) {
			if (c.getData().equals(data)) {
				return c;
			}
		}
		throw new ExcecaoSistemaDeCaixa ("Regisstro inexistente!");
	}
}
