package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;

public class GerenteDeCliente {
	private List <Cliente> clientes;
	
	public GerenteDeCliente(){
		this.clientes = new LinkedList<Cliente>();
	}

	public void cadastra(String nome, String cpf, String endereco) {
		for (Cliente c: this.clientes) {
			if (c.getCpf().equals(cpf)) {
				throw new ExcecaoSistemaDeCliente ("Cliente já existe!");
			}
		}
		Cliente cliente = new Cliente (nome, cpf, endereco);
		this.clientes.add(cliente);
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

	public void removerClientePorCpf(String cpf) {
		boolean remove = false;
		for(Cliente cli: this.clientes){
			if(cli.getCpf().equals(cpf)){
				this.clientes.remove(cli);
				remove = true;
				break;
			}
		}
		if(!remove){
			throw new ExcecaoSistemaDeCliente("Cliente Inexistente");
		}
		
	}
	
	
}








