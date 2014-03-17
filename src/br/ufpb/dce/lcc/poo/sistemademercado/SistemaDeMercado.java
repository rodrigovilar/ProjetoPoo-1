package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.List;

public class SistemaDeMercado {
	GerenteDeFuncionario funcionarios;
	GerenteDeProduto produtos;
	GerenteDeFornecedor fornecedores;
	GerenteDeCliente clientes;
	GerenteDeCaixa caixas;
	GerenteDeItemDePedido pedidos;
	
	public SistemaDeMercado () {
		funcionarios = new GerenteDeFuncionario ();
		produtos = new GerenteDeProduto ();
		fornecedores = new GerenteDeFornecedor();
		clientes = new GerenteDeCliente();
		caixas = new GerenteDeCaixa();
		pedidos = new GerenteDeItemDePedido();
		
		
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
		this.fornecedores.cadastra(nome, cidade,telefone, cnpj);
	}

	public Fornecedor pesquisaFornecedorPeloNome(String nome) {
		return this.fornecedores.pesquisaPorNome(nome);
	}
	
	public Fornecedor pesquisaFornecedorPorCnpj (String cnpj) {
		return this.fornecedores.pesquisaPorCnpj(cnpj); 
	}

	public void removerFornecedorPorCnpj(String cnpj) {
		fornecedores.removeFornecedorPorCnpj(cnpj);
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

	public void removeClientePorCpf (String cpf) {
		clientes.removerClientePorCpf (cpf);
		
	}

	public void iniciaCaixaDiario (String data) {
		this.caixas.registrar(data);
	}

	public CaixaDiario pesquisaCaixaDiario(String data) {
        return this.caixas.pesquisaDiaria (data);
	}

	public void alterarPrecoDeProduto(int i, double d) {
		  this.produtos.alteraPreco (i, d);
	}
	public String pesquisaPrecoDeProduto(int i) {
		  return this.produtos.pesquisaDescricaoDePrecoDeProduto(i);
	}

	public List <Produto> exibirProdutos() {
		return produtos.buscarProdutos();
	}
	public List <Cliente> exibirClientes() {
		return clientes.buscarClientes();
	}

	public List <Funcionario> exibirFuncionarios() {
		return funcionarios.buscaFuncionarios();
	}

	public List <Fornecedor> exibirFornecedores() {
		return fornecedores.buscarFornecedores();
	}
	public List <ItemDePedido> exibirItemDePedido() {
		return pedidos.buscarItemDePedido();
	}


	public Fornecedor pesquisaFornecedorPassandoCnpj(String cnpj) {
		return this.fornecedores.pesquisaPorCnpj(cnpj);
	}

	public ItemDePedido pesquisaItemDePedido(String cpfCliente, int numeroDoItem) {
		return this.pedidos.pesquisaItemDePedido (cpfCliente, numeroDoItem);
	}

	public void cadastrarItemDePedido(Produto produto, Cliente cliente, int numPedido) {
		pedidos.cadastraItem(produto, cliente, numPedido);
		
	}

	public void romorePedido(int numProduto) {
		pedidos.remover(numProduto);
		
	}

	
	

	

	
	
	
	
}






