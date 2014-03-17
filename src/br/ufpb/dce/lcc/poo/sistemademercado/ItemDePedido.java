package br.ufpb.dce.lcc.poo.sistemademercado;

public class ItemDePedido {
	private Cliente cliente;
	private Produto produto;
	private int numeroDeItem;
	
	public ItemDePedido (Produto produto, Cliente c, int numero) {
		this.produto = produto;
		this.cliente = c;
		this.numeroDeItem = numero;
	}
	public Produto getProduto() {
		return this.produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNumeroDeItem() {
		return numeroDeItem;
	}
	public void setNumeroDeItem(int numeroDeItem) {
		this.numeroDeItem = numeroDeItem;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

}
