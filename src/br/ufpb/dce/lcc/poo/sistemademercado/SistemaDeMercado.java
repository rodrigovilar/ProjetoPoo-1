package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;


public class SistemaDeMercado {
	private List <Funcionario> funcionarios;
	
	public SistemaDeMercado () {
		this.funcionarios = new LinkedList <Funcionario>();
	}
	
	public void cadastraFuncionario(String n, String cpf) {
		for (Funcionario f: this.funcionarios){
			if (f.getCpf().equals(cpf)){
				throw new ExcecaoSistemaDeMercado ("Funcionario já Existente!");
			}
		}
		Funcionario f  = new Funcionario (n , cpf);
		funcionarios.add(f);
	}
	
	public void removeFuncionarioPorCPF(String cpf) {
		boolean removeu = false;
		for (Funcionario f: this.funcionarios) {
			if (f.getCpf().equals(cpf))
				this.funcionarios.remove(f);
				removeu = true;
		}
		if (removeu == false) {
			throw new ExcecaoSistemaDeMercado ("Funcionario nao Existente no Sistema!");
		}
	}

	public Funcionario pesquisaFuncionarioPeloNome(String nome) {
		Funcionario f2 = null;
		for (Funcionario f: this.funcionarios) {
			if (f.getNome().equals(nome))
				f2 = f;
		}
		return f2;
	}

	public Funcionario pesquisaFuncionarioPeloCPF(String cpf) {
		Funcionario f2 = null;
		for (Funcionario f: this.funcionarios) {
			if (f.getCpf().equals(cpf))
				f2 = f;
		}
		return f2;
	}

	public boolean finalizou() {
		// TODO Auto-generated method stub
		return false;
	}

}
