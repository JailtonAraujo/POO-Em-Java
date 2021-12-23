package br.com.caelum.contas.modelo;

public class SeguroDeVida {

	private double Valor;
	private String Titular;
	private int NumeroApolice;

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public int getNumeroApolice() {
		return NumeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		NumeroApolice = numeroApolice;
	}

}
