package br.ufpb.dce.lcc.poo.sistemademercado;

public class Fornecedor {
	private String nemoFornecedor;
	private String CidadeDoFornecedor;
	private int TelefoneDoFornecedor;
	private String cnpjDoFornecedor;
	
	public Fornecedor(String nemoFornecedor, String CidadeDoFornecedor, int TelefoneDoFornecedor, String cnpjDoFornecedor){
		this.nemoFornecedor = nemoFornecedor;
		this.CidadeDoFornecedor = CidadeDoFornecedor;
		this.TelefoneDoFornecedor = TelefoneDoFornecedor;
		this.cnpjDoFornecedor = cnpjDoFornecedor;
	}
	public String getNemoFornecedor() {
		return nemoFornecedor;
	}
	public void setNemoFornecedor(String nemoFornecedor) {
		this.nemoFornecedor = nemoFornecedor;
	}
	public String getCidadeDoFornecedor() {
		return CidadeDoFornecedor;
	}
	public void setCidadeDoFornecedor(String cidadeDoFornecedor) {
		CidadeDoFornecedor = cidadeDoFornecedor;
	}
	public int getTelefoneDoFornecedor() {
		return TelefoneDoFornecedor;
	}
	public void setTelefoneDoFornecedor(int telefoneDoFornecedor) {
		TelefoneDoFornecedor = telefoneDoFornecedor;
	}
	public String getCnpjDoFornecedor() {
		return cnpjDoFornecedor;
	}
	public void setCnpjDoFornecedor(String cnpjDoFornecedor) {
		this.cnpjDoFornecedor = cnpjDoFornecedor;
	}
	
	

}
