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
		throw new ExcecaoSistemaDeCliente("Cliente Inexistente");
	}

	public Cliente pesquisaPorCpf(String cpf) {
		for(Cliente c: this.clientes){
			if(c.getCpf().equals(cpf)){
				return c;
			}
		}
		throw new ExcecaoSistemaDeCliente("Cliente Inexistente");
	}

	public void removerClientePorNome(String nome) {
		boolean remove = false;
		for(Cliente cli: this.clientes){
			if(cli.getNome().equals(nome)){
				this.clientes.remove(cli);
				remove = true;
				
			}
		}
		if(!remove){
			throw new ExcecaoSistemaDeCliente("Cliente Inexistente");
		}
		
	}

}
