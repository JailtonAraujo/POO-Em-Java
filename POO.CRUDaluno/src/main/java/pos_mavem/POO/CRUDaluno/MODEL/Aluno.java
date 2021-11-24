package pos_mavem.POO.CRUDaluno.MODEL;

import java.util.Objects;

import javax.annotation.processing.Generated;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Aluno extends Pessoa{
	private String DataMatricula;
	private String NomeEscola;
	private String SerieMatriculado;
	
	public Aluno() {}
	
	public Aluno(int id, String nome, String cPF, String rG, String dataNascimento, String nomePai, String nomeMae, String dataMatricula, String nomeEscola, String serieMatriculado) {
		super(id, nome, cPF, rG, dataNascimento, nomePai, nomeMae);//*Construtor da class mãe*//
		DataMatricula = dataMatricula;
		NomeEscola = nomeEscola;
		SerieMatriculado = serieMatriculado;
	}

	public String getDataMatricula() {
		return DataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		DataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return NomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		NomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return SerieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		SerieMatriculado = serieMatriculado;
	}

	@Override
	public String toString() {
		return "Aluno [DataMatricula=" + DataMatricula + ", NomeEscola=" + NomeEscola + ", SerieMatriculado="
				+ SerieMatriculado + ", getID()=" + getID() + ", getNome()=" + getNome() + ", getCPF()=" + getCPF()
				+ ", getRG()=" + getRG() + ", getDataNascimento()=" + getDataNascimento() + ", getNomePai()="
				+ getNomePai() + ", getNomeMae()=" + getNomeMae() + ", toString()=" + super.toString() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(DataMatricula, NomeEscola, SerieMatriculado);
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
		Aluno other = (Aluno) obj;
		return Objects.equals(DataMatricula, other.DataMatricula) && Objects.equals(NomeEscola, other.NomeEscola)
				&& Objects.equals(SerieMatriculado, other.SerieMatriculado);
	}
	
	
	
}
