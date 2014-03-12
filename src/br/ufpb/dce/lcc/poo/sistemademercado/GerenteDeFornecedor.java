package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;

public class GerenteDeFornecedor {
	private List <Fornecedor> fornecedores;
	
	public GerenteDeFornecedor(){
		this.fornecedores = new LinkedList<Fornecedor>();
	}

	public void cadastra(String nome, String cidade, int telefone, String cnpj) {
		Fornecedor f = new Fornecedor(nome, cidade, telefone, cnpj);
		fornecedores.add(f);
		
	}

	public Fornecedor pesquisaPorNome(String nome) {
		for(Fornecedor f: this.fornecedores){
			if(f.getNemoFornecedor().equals(nome)){
				return f;
			}
		}
		return null;
	}

	public void removeFornecedorPorNome(String nome) {
		boolean remove = false;
		for(Fornecedor f: this.fornecedores){
			if(f.getNemoFornecedor().equals(nome)){
				this.fornecedores.remove(f);
				remove = true;
				break;
			}
		}if(!remove){
			throw new ExcecaoSistemaDeFornecedor("Fornevedor não encontrado");
		}
		
	}

}
