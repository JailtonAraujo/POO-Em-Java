package pos_mavem.POO.CRUDaluno.MODEL;

import java.util.Objects;

public class Endereco {
	private String Logradouro;
	private String Cidade;
	private String Refetencia;

	public Endereco() {}
	
	
	
	public Endereco(String logradouro, String cidade, String refetencia) {
		Logradouro = logradouro;
		Cidade = cidade;
		Refetencia = refetencia;
	}



	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getRefetencia() {
		return Refetencia;
	}

	public void setRefetencia(String refetencia) {
		Refetencia = refetencia;
	}

	@Override
	public String toString() {
		return "Endereco [Logradouro=" + Logradouro + ", Cidade=" + Cidade + ", Refetencia=" + Refetencia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Cidade, Logradouro, Refetencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(Cidade, other.Cidade) && Objects.equals(Logradouro, other.Logradouro)
				&& Objects.equals(Refetencia, other.Refetencia);
	}

}
