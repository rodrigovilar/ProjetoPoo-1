package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;

public class GerenteDeCliente {
	private List <Cliente> clientes;
	
	public GerenteDeCliente(){
		this.clientes = new LinkedList<Cliente>();
	}

	public void cadastra(String nome, String cpf, String endereco) {
		Cliente p = new Cliente(nome, cpf, endereco);
		clientes.add(p);
		
	}

	public Cliente pesquisaPorNome(String nome) {
		for(Cliente c: this.clientes){
			if(c.getNome().equals(nome)){
				return c;
			}
		}
		throw new ExcecaoSistemaDeCliente("Cliente Existente");
	}

}
