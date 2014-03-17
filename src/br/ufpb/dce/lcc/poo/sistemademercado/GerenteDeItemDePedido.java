package br.ufpb.dce.lcc.poo.sistemademercado;

import java.util.LinkedList;
import java.util.List;

public class GerenteDeItemDePedido {
	private List<ItemDePedido> itensPedido;
	
	public GerenteDeItemDePedido(){
		this.itensPedido  = new LinkedList <ItemDePedido>();
	}

	public void cadastraItem(Produto produto, Cliente cliente, int numPedido) {
		ItemDePedido item = new ItemDePedido (produto, cliente, numPedido);
		this.itensPedido.add(item);
	}

	public ItemDePedido pesquisaItemDePedido(String cpfCliente, int numItem) {
		for (ItemDePedido i: this.itensPedido) {
			if ((i.getCliente().getCpf().equals(cpfCliente))&& (i.getNumeroDeItem() == numItem)) {
				return i;
			}
		}
		throw new ExcecaoSistemaDeMercado ("Item Inexistente!");
	}
}
