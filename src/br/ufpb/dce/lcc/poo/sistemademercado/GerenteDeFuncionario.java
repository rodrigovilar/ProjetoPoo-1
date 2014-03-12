package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;

public class GerenteDeFuncionario {
    
	private List <Funcionario> funcionarios;
	
	public GerenteDeFuncionario () {
		this.funcionarios = new LinkedList <Funcionario>();
	}
	
	public void cadastra (String n, String cpf, String funcao) {
		for (Funcionario f: this.funcionarios){
			if (f.getCpf().equals(cpf)){
				throw new ExcecaoSistemaDeMercado ("Funcionario já Existe!");
			}
		}
		Funcionario f  = new Funcionario (n, cpf, funcao);
		funcionarios.add(f);
	}
	
	public void removePorCPF(String cpf) {
		boolean removeu = false;
		for (Funcionario f: this.funcionarios) {
			if (f.getCpf().equals(cpf))
				this.funcionarios.remove(f);
				removeu = true;
				break;
		}
		if (!removeu) {
			throw new ExcecaoSistemaDeMercado ("Funcionario nao Existente no Sistema!");
		}
	}

	public Funcionario pesquisaPorNome(String nome) {
		Funcionario f2 = null;
		for (Funcionario f: this.funcionarios) {
			if (f.getNome().equals(nome))
				f2 = f;
		}
		return f2;
	}

	public Funcionario pesquisaPorCPF(String cpf) {
		Funcionario f2 = null;
		for (Funcionario f: this.funcionarios) {
			if (f.getCpf().equals(cpf))
				f2 = f;
		}
		return f2;
	}
}
