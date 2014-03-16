package br.ufpb.dce.lcc.poo.sistemademercado;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaDeMercadoTest {
	private SistemaDeMercado sistema;
   
	@Before
	public void iniciar () {
		sistema = new SistemaDeMercado ();
		assertFalse ("O sistema iniciou acabado", sistema.finalizou());
	}
	@Test                                                                      // TESTES FUNCIONARIO
	public void cadastrarFuncionarioNoSistema () {
		sistema.cadastraFuncionario("edu","12345","Caixa");
		assertNotNull(sistema.pesquisaFuncionarioPorNome("edu"));
	}
	@Test
	public void removerFuncionarioDoSistemaPorCPF () {
		sistema.cadastraFuncionario("edu","123","Caixa");
		sistema.removeFuncionarioPorCPF("123");
		assertNull (sistema.pesquisaFuncionarioPorCPF("12345"));
	}
	@Test
	public void pesquisarFuncionarioNoSistemaPeloNome () {
		this.cadastrarFuncionarioNoSistema();
		assertNotNull(sistema.pesquisaFuncionarioPorNome("edu"));
	}
	@Test
	public void pesquisarFuncionarioNoSistemaPeloCPF () {
		this.cadastrarFuncionarioNoSistema(); 
		assertNotNull(sistema.pesquisaFuncionarioPorCPF("12345"));
	}
	@Test (expected = ExcecaoSistemaDeMercado.class)
	public void cadastrarMesmoFuncionarioNoSistema () {
		sistema.cadastraFuncionario("edu","12345", "Caixa");
		sistema.cadastraFuncionario("edu","12345", "Caixa");
	}
	@Test (expected = ExcecaoSistemaDeMercado.class)
	public void removerFuncionarioPorCPFQueNaoEstaNoSistema () {
		sistema.removeFuncionarioPorCPF("32344");
	}
	@Test
	public void pesquisarFuncionarioPorCPFQueNaoEstaNoSistema(){
		assertNull(sistema.pesquisaFuncionarioPorCPF("1010"));
	}
	@Test
	public void pesquisarFuncionarioPornomeQueNaoEstaNoSistema(){
		assertNull(sistema.pesquisaFuncionarioPorNome("edu"));
	}
	@Test                                                                             //TESTES PRODUTO
	public void cadastrarProduto(){
		sistema.cadastraProduto("leite", 1234, 8.00);
		assertNotNull(sistema.pesquisaProdutoPorNome("leite"));
	}
	@Test
	public void pesquisarProdutoNome(){
		this.cadastrarProduto();
		assertNotNull(sistema.pesquisaProdutoPorNome("leite"));
	}
	@Test 
	public void pesquisarProdutoInexistentePassandoNome () {
		assertNull(sistema.pesquisaProdutoPorNome("feijão"));
	}
	@Test (expected = ExcecaoSistemaDeProduto.class)
	public void removerProdutoPassandoCodigo(){
		this.cadastrarProduto();
		sistema.removeProdutoPorCodigo(1234);
		sistema.pesquisaProdutoPorCodigo(1234);
	}
	@Test (expected = ExcecaoSistemaDeProduto.class)
	public void removerProdutoPorInexistentePassandoCodigo () {
		sistema.removeProdutoPorCodigo(10);
	} 
	@Test
	public void pesquisarProdutoPorCodigo(){
		this.cadastrarProduto();
		assertNotNull(sistema.pesquisaProdutoPorCodigo(1234));
	}
	@Test                                                                                  //TESTES FORNECEDOR
	public void cadastrarFornecedor(){
		sistema.cadastraFornecedor("Fornecedor de Leite", "Rio Tinto", 88888888,"12345678");
		assertNotNull(sistema.pesquisaFornecedorPeloNome("Fornecedor de Leite"));
	}
	@Test (expected = ExcecaoSistemaDeFornecedor.class)
	public void cadastraMesmoFornecedor () {
		this.cadastrarFornecedor();
		this.cadastrarFornecedor();
    }
	@Test
	public void pesquisaPorFornecedor(){
		this.cadastrarFornecedor();
		assertNotNull(sistema.pesquisaFornecedorPeloNome("Fornecedor de Leite"));
	}
	@Test 
	public void removerFornecedor(){
		this.cadastrarFornecedor();
		sistema.removerFornecedorPorCnpj("12345678");
		assertNull (sistema.pesquisaFornecedorPorCnpj("12345678"));
	}
	@Test
	public void cadastrarCliente(){                                                  // TESTES CLIENTE
		sistema.cadastroDeCliente("Fabio","2014","Centro");
		assertNotNull(sistema.pesquisaClientePorNome("Fabio"));
	}
	@Test (expected = ExcecaoSistemaDeCliente.class)
	public void cadastrarMesmoCliente () {
		this.cadastrarCliente();
		this.cadastrarCliente();
	}  
	@Test
	public void pesquisarClientePorNome(){
		this.cadastrarCliente();
		assertNotNull(sistema.pesquisaClientePorNome("Fabio"));
	}
	@Test
	public void pesquisarClientePorCpf(){
		this.cadastrarCliente();
		assertNotNull(sistema.pesquisaClientePorCpf("2014"));
	}
	@Test (expected = ExcecaoSistemaDeCliente.class)
	public void removerCliente(){
		this.cadastrarCliente();
		sistema.removeClientePorCpf("2014");
		sistema.pesquisaClientePorCpf ("2014");
	}
	@Test (expected = ExcecaoSistemaDeCliente.class)
	public void pesquisarClienteInexistentePorNome () {
		sistema.pesquisaClientePorNome("Eduardo");
	}
	@Test (expected = ExcecaoSistemaDeCliente.class)
	public void pesquisarClienteInexistentePorCpf () {
		sistema.pesquisaClientePorCpf("123456789");
	}
	@Test (expected = ExcecaoSistemaDeCliente.class)
	public void removerClienteInexistente () {
		sistema.removeClientePorCpf("12345");
	}
	@Test
	public void iniciarCaixaDiario(){
		sistema.iniciaCaixaDiario ("16/10/2014");
		assertNotNull (sistema.pesquisarCaixaDiario("16/10/2014"));
	}
	@Test (expected = ExcecaoSistemaDeCaixa.class)
	public void inserirCaixaComDataJaExistente () {
		this.iniciarCaixaDiario();
		this.iniciarCaixaDiario();
	}
}









