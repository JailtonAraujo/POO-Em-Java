package Class;

import java.util.Objects;

public abstract class Pessoa {
	private int ID;
	private String Nome;
	private String CPF;
	private String RG;
	private String DataNascimento;
	private String NomePai;
	private String NomeMae;
	
	public Pessoa() {}

	public Pessoa(int id, String nome, String cPF, String rG, String dataNascimento, String nomePai, String nomeMae) {
		ID = id;
		Nome = nome;
		CPF = cPF;
		RG = rG;
		DataNascimento = dataNascimento;
		NomePai = nomePai;
		NomeMae = nomeMae;
	}
	
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public String getNomePai() {
		return NomePai;
	}

	public void setNomePai(String nomePai) {
		NomePai = nomePai;
	}

	public String getNomeMae() {
		return NomeMae;
	}

	public void setNomeMae(String nomeMae) {
		NomeMae = nomeMae;
	}

	

	@Override
	public String toString() {
		return "Pessoa [ID=" + ID + ", Nome=" + Nome + ", CPF=" + CPF + ", RG=" + RG + ", DataNascimento="
				+ DataNascimento + ", NomePai=" + NomePai + ", NomeMae=" + NomeMae + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF, DataNascimento, ID, Nome, NomeMae, NomePai, RG);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(DataNascimento, other.DataNascimento) && ID == other.ID
				&& Objects.equals(Nome, other.Nome) && Objects.equals(NomeMae, other.NomeMae)
				&& Objects.equals(NomePai, other.NomePai) && Objects.equals(RG, other.RG);
	}

	

	
	
	
	
	
}