package Class;

import java.util.Objects;

public class Secretario extends Pessoa{
	private String Registro;
	private String NivelCargo;
	private String Experiencia;
	
	public Secretario() {}
	
	public Secretario(int id, String nome, String cPF, String rG, String dataNascimento, String nomePai, String nomeMae, String registro, String nivelCargo, String experiencia) {
		super(id, nome, cPF, rG, dataNascimento, nomePai, nomeMae); //*Construtor da class mãe*//
		this.Registro = registro;
		this.NivelCargo = nivelCargo;
		this.Experiencia = experiencia;
	}

	public String getRegistro() {
		return Registro;
	}

	public void setRegistro(String registro) {
		Registro = registro;
	}

	public String getNivelCargo() {
		return NivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		NivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return Experiencia;
	}

	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [Registro=" + Registro + ", NivelCargo=" + NivelCargo + ", Experiencia=" + Experiencia
				+ ", getID()=" + getID() + ", getNome()=" + getNome() + ", getCPF()=" + getCPF() + ", getRG()="
				+ getRG() + ", getDataNascimento()=" + getDataNascimento() + ", getNomePai()=" + getNomePai()
				+ ", getNomeMae()=" + getNomeMae() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Experiencia, NivelCargo, Registro);
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
		Secretario other = (Secretario) obj;
		return Objects.equals(Experiencia, other.Experiencia) && Objects.equals(NivelCargo, other.NivelCargo)
				&& Objects.equals(Registro, other.Registro);
	}
	
	
	
}
