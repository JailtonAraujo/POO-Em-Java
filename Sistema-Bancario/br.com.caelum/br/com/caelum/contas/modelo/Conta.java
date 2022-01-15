package br.com.caelum.contas.modelo;


public abstract class Conta {
	private int Identificador;
	public String NomeTitular;
	public int NumeroConta;
	public String Agencia;
	public double Saldo;
	public Data Data;
	
	
	public Conta() {}
	
	
	
	public Conta(String nomeTitular) {
		NomeTitular = nomeTitular;
	}


	public int getIdentificador() {
		return this.Identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.Identificador = identificador;
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

	public Data getData() {
		return Data;
	}

	public void setData(Data data) {
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
		dados += "\nTitular: "+this.NomeTitular;
		dados += "\nNumero Da Conta: "+this.NumeroConta;
		dados += "\nAgência: "+this.Agencia;
		dados += "\nSaldo: "+this.Saldo;
		
		dados += "\nData De Abertura: "+this.Data.formatada();
		
		return dados;
	}
	
	public boolean Entrar(String login, String senha) {
		if (login.equals("admin") && senha.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
	
}
