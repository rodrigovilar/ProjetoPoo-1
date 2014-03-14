package br.ufpb.dce.lcc.poo.sistemademercado;

public class SistemaDeMercado {
	GerenteDeFuncionario funcionarios;
	GerenteDeProduto produtos;
	GerenteDeFornecedor fornecedores;
	GerenteDeCliente clientes;
	
	public SistemaDeMercado () {
		funcionarios = new GerenteDeFuncionario ();
		produtos = new GerenteDeProduto ();
		fornecedores = new GerenteDeFornecedor();
		clientes = new GerenteDeCliente();
		
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

	public void removeProdutoPorCodigo(int cod) {
		produtos.removePorCodigo(cod);
		
	}

	public Produto pesquisaProdutoPorCodigo(int codigo) {
		return produtos.pesquisaPorCodigo(codigo);
		
	}


	public void cadastraFornecedor(String nome, String cidade, int telefone, String cnpj) {
		fornecedores.cadastra(nome, cidade,telefone, cnpj);
	}

	public Fornecedor pesquisaFornecedorPeloNome(String nome) {
		return fornecedores.pesquisaPorNome(nome);
	}

	public void removerFornecedorPornome(String nome) {
		fornecedores.removeFornecedorPorNome(nome);
		
	}

	public void cadastroDeCliente(String nome, String cpf, String endereco) {
		clientes.cadastra(nome, cpf, endereco);
		
	}

	public Cliente pesquisaClientePorNome(String nome) {
		return clientes.pesquisaPorNome(nome);
	}

	public Cliente pesquisaClientePorCpf(String cpf) {
		return clientes.pesquisaPorCpf(cpf);
	}

	public void removeClientePorNome(String nome) {
		clientes.removerClientePorNome(nome);
		
	}
	
	
}






