package Class;

import java.util.Objects;

public class Diretor extends Pessoa{
	private String RegistroEducacao;
	private String TempoDirecao;
	private String Titulacao;
	
	public Diretor() {}

	
	public Diretor(int id, String nome, String cPF, String rG, String dataNascimento, String nomePai, String nomeMae, String registroEducacao, String tempoDirecao, String titulacao) {
		super(id, nome, cPF, rG, dataNascimento, nomePai, nomeMae); //*Construtor da class mãe*//
		this.RegistroEducacao = registroEducacao;
		this.TempoDirecao = tempoDirecao;
		this.Titulacao = titulacao;
	}


	public String getRegistroEducacao() {
		return RegistroEducacao;
	}


	public void setRegistroEducacao(String registroEducacao) {
		RegistroEducacao = registroEducacao;
	}


	public String getTempoDirecao() {
		return TempoDirecao;
	}


	public void setTempoDirecao(String tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}


	public String getTitulacao() {
		return Titulacao;
	}


	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}


	@Override
	public String toString() {
		return "Diretor [RegistroEducacao=" + RegistroEducacao + ", TempoDirecao=" + TempoDirecao + ", Titulacao="
				+ Titulacao + ", getID()=" + getID() + ", getNome()=" + getNome() + ", getCPF()=" + getCPF()
				+ ", getRG()=" + getRG() + ", getDataNascimento()=" + getDataNascimento() + ", getNomePai()="
				+ getNomePai() + ", getNomeMae()=" + getNomeMae() + ", toString()=" + super.toString() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(RegistroEducacao, TempoDirecao, Titulacao);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(RegistroEducacao, other.RegistroEducacao)
				&& Objects.equals(TempoDirecao, other.TempoDirecao) && Objects.equals(Titulacao, other.Titulacao);
	}

	
	
	
	
}
