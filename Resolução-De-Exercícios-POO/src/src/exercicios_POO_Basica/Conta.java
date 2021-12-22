package exercicios_POO_Basica;

public class Conta {
	private String NomeTitular;
	private int NumeroConta;
	private String Agencia;
	private double Saldo;
	private String Data;
	
	
	public Conta() {}
	
	
	
	public Conta(String nomeTitular, int numeroConta, String agencia, double saldo, String data) {
		NomeTitular = nomeTitular;
		NumeroConta = numeroConta;
		Agencia = agencia;
		Saldo = saldo;
		Data = data;
	}



	public String getNomeTitular() {
		return NomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		NomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return NumeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}

	public String getAgencia() {
		return Agencia;
	}

	public void setAgencia(String agencia) {
		Agencia = agencia;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public void Sacar(double Valor) {
		if(this.Saldo < Valor) {
			System.out.println("Saldo insuficiente!");
		}else {
			this.Saldo = this.Saldo - Valor;
			System.out.println("Valor de "+Valor+" sacado com sucesso");
		}
	}
	
	public void Depositar(double Valor) {
		this.Saldo = this.Saldo+ Valor;
		System.out.println("Deposito de "+Valor+ "depositado com sucesso!");
	}
	
	public double CalculaRendimento() {
		return this.Saldo * 0.1;
	}
	
	public String RecuperaDadosImpressao() {
		String dados= "";
		dados = "Nome Do Titular: "+this.NomeTitular+""
				+"/nNumero Da Conta: "+this.NumeroConta+""
				+ "/nAgência: "+this.Agencia+""
				+ "/nSaldo: "+this.Saldo+""
				+ "/nData: "+this.Data;
		
		
		return dados;
	}
	
}
