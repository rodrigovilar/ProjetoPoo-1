package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;

public class GerenteDeProduto {
	private List <Produto> produtos;
	
	public GerenteDeProduto(){
		this.produtos = new LinkedList <Produto>();
	}

	public void cadastra(String nome, int codigo, double preco){
		Produto p = new Produto(nome, codigo, preco);
		produtos.add(p);
		
	}

	public Produto pesquisaPorNome(String nome) {
		for(Produto p: this.produtos){
			if(p.getNome().equals(nome)){
				return p;
			}
		}
		
		return null;
	}

	public void removePorNome(String nome){
		boolean remove = false;
		for(Produto p: this.produtos){
			if(p.getNome().equals(nome)){
				this.produtos.remove(p);
				remove = true;
				break;
			}
		}if(remove == false){
			throw new ExcecaoSistemaDeProduto("Produto não encontrado");
		}
	}

	public Produto pesquisaPorCodigo(int codigo){		
		for(Produto p: this.produtos){
			if(p.getCodigo() == (codigo)){
				return p;
			}
		}
		
		throw new ExcecaoSistemaDeProduto("O produto não encontrado");
	}	

}