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
	
	@Test
	public void cadastrarFuncionarioNoSistema () {
		sistema.cadastraFuncionario("edu","12345","Caixa");
		assertNotNull(sistema.pesquisaFuncionarioPorNome("edu"));
	}
	@Test
	public void removerFuncionarioDoSistemaPorCPF () {
		sistema.cadastraFuncionario("edu","12345","Caixa");
		sistema.removeFuncionarioPorCPF("12345");
		assertNull (sistema.pesquisaFuncionarioPorNome("edu"));
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
		
		
		
}