package br.ufpb.dce.lcc.poo.sistemademercado;


import java.util.LinkedList;
import java.util.List;

public class Caixa {
	private List <Diaria> diarias;
	
	public Caixa(){
		this.diarias = new  LinkedList<Diaria> ();
	}
	public void registrar(String data){
		for(Diaria d: this.diarias){
			if(d.getData().equals(data)){
				throw new ExcecaoSistemaDeCaixa ("Caixa já existe!");
			}
		}
		Diaria diar = new Diaria(data);
		this.diarias.add(diar);
		
	}
	public void iniciar(String data) {
		
		
		
	}
	
	
}
