package br.com.caelum.contas.modelo;


public class Data {
	public int Dia;
	public int Mes;
	public int Ano;
	
	public String formatada() {
		String data = "";
		
		return data = this.Dia+"/"+this.Mes+"/"+this.Ano ;
	}
}
