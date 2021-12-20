package pos_mavem.POO.CRUDaluno.MODEL;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor extends Pessoa {
	private String disciplina;
	private String registro;
	
	public Professor() {}
	
	

	public Professor(int iD, String nome, String cPF, String rG, String dataNascimento, String nomePai,
			String nomeMae, String disciplina, String registro) {
		super(iD, nome, cPF, rG, dataNascimento, nomePai, nomeMae);
		
		this.disciplina = disciplina;
		this.registro = registro;
		// TODO Auto-generated constructor stub
	}



	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Override
	public String toString() {
		return "Professor [disciplina=" + disciplina + ", registro=" + registro + ", getContato()=" + getContato()
				+ ", getID()=" + getID() + ", getNome()=" + getNome() + ", getCPF()=" + getCPF() + ", getRG()="
				+ getRG() + ", getDataNascimento()=" + getDataNascimento() + ", getNomePai()=" + getNomePai()
				+ ", getNomeMae()=" + getNomeMae() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(disciplina, registro);
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
		Professor other = (Professor) obj;
		return Objects.equals(disciplina, other.disciplina) && Objects.equals(registro, other.registro);
	}

}
