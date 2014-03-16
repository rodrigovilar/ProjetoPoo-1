package br.ufpb.dce.lcc.poo.sistemademercado;

public class CaixaDiario {
	private String data;
	private double apurado;
	
	public CaixaDiario(String data){
		this.data = data;
		
	}
	
	public String getData() {
		return data;
	}

	public double getApurado() {
		return apurado;
	}

	public void setApurado(double apurado) {
		this.apurado = apurado;
	}	
}
