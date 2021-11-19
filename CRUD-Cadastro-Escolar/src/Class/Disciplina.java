package Class;

import java.util.Objects;

public class Disciplina {

	private String NomeDisciplina;
	private float Nota;
	
	public Disciplina() {}
	

	public Disciplina(String nomeDisciplina, float nota) {
		NomeDisciplina = nomeDisciplina;
		Nota = nota;
	}


	public String getNomeDisciplina() {
		return NomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		NomeDisciplina = nomeDisciplina;
	}

	public float getNota() {
		return Nota;
	}

	public void setNota(float nota) {
		Nota = nota;
	}


	@Override
	public String toString() {
		return "Disciplina [NomeDisciplina=" + NomeDisciplina + ", Nota=" + Nota + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(NomeDisciplina, Nota);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(NomeDisciplina, other.NomeDisciplina)
				&& Float.floatToIntBits(Nota) == Float.floatToIntBits(other.Nota);
	}
	
	
	
	
}
