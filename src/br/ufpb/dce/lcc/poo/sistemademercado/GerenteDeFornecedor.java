package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;

public class GerenteDeFornecedor {
	private List <Fornecedor> fornecedores;
	
	public GerenteDeFornecedor(){
		this.fornecedores = new LinkedList<Fornecedor>();
	}

	public void cadastra(String nome, String cidade, int telefone, String cnpj) {
		for (Fornecedor f: this.fornecedores) {
			if (f.getCnpj().equals(cnpj)) {
				throw new ExcecaoSistemaDeFornecedor ("Fornecedor já existe!");
			}
		}
		Fornecedor f = new Fornecedor(nome, cidade, telefone, cnpj);
		fornecedores.add(f);
		
	}

	public Fornecedor pesquisaPorNome(String nome) {
		for(Fornecedor f: this.fornecedores){
			if(f.getNome().equals(nome)){
				return f;
			}
		}
		return null;
	}
	public Fornecedor pesquisaPorCnpj (String cnpj) {
		for(Fornecedor f: this.fornecedores){
			if(f.getCnpj().equals(cnpj)){
				return f;
			}
		}
		return null;
	}

	public void removeFornecedorPorCnpj (String cnpj) {
		boolean remove = false;
		for(Fornecedor f: this.fornecedores){
			if(f.getCnpj().equals(cnpj)){
				this.fornecedores.remove(f);
				remove = true;
				break;
			}
		}if(!remove){
			throw new ExcecaoSistemaDeFornecedor("Fornevedor não encontrado");
		}
		
	}

	public List<Fornecedor> buscarFornecedores() {
		if(fornecedores.size() > 0){
			return this.fornecedores;
		}
		else{
			return null;
		}
	}

}
