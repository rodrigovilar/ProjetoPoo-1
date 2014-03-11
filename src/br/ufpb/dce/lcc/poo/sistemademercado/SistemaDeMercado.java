package br.ufpb.dce.lcc.poo.sistemademercado;

public class SistemaDeMercado {
	GerenteDeFuncionario funcionarios;
	GerenteDeProduto produtos;
	
	public SistemaDeMercado () {
		funcionarios = new GerenteDeFuncionario ();
		produtos = new GerenteDeProduto ();
		
	}
	        
	public void cadastraFuncionario (String n, String cpf, String funcao) {
		funcionarios.cadastra (n, cpf, funcao);
	}
	public void removeFuncionarioPorCPF (String cpf) {
	    funcionarios.removePorCPF(cpf);	
	}
	public Funcionario pesquisaFuncionarioPorNome (String n) {
		return funcionarios.pesquisaPorNome(n);
	}
	public Funcionario pesquisaFuncionarioPorCPF (String cpf) {
		return funcionarios.pesquisaPorCPF(cpf);
	}
	
	public boolean finalizou () {
		return false;
	}

	public void cadastraProduto(String nome, int codigo, double preco) {
		produtos.cadastra(nome, codigo, preco);
		
	}

	public Produto pesquisaProdutoPorNome(String nome) {
		return produtos.pesquisaPorNome(nome);
		
	}
	
	
}






