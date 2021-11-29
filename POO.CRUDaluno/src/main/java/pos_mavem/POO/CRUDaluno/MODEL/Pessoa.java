package pos_mavem.POO.CRUDaluno.MODEL;

import java.util.List;
import java.util.Objects;

import javax.annotation.processing.Generated;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "empid_generator")
	@TableGenerator(name = "empid_generator", initialValue = 1, allocationSize = 1)
	private int ID;
	private String Nome;
	private String CPF;
	private String RG;
	private String DataNascimento;
	private String NomePai;
	private String NomeMae;
	
	
	
	@OneToMany(mappedBy = "pessoa", cascade =  javax.persistence.CascadeType.ALL)
	private List<Contato> contato;


	
	
	public Pessoa(int iD, String nome, String cPF, String rG, String dataNascimento, String nomePai, String nomeMae) {
		ID = iD;
		Nome = nome;
		CPF = cPF;
		RG = rG;
		DataNascimento = dataNascimento;
		NomePai = nomePai;
		NomeMae = nomeMae;
	}
	




	public List<Contato> getContato() {
		return contato;
	}









	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}









	public Pessoa() {
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
