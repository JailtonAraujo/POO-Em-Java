package pos_mavem.POO.CRUDaluno.MODEL;

import java.util.Objects;

public class Contato {
	private String Telefone;
	private String Email;

	public Contato() {
	}

	public Contato(String telefone, String email) {
		Telefone = telefone;
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Contato [Telefone=" + Telefone + ", Email=" + Email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Email, Telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(Telefone, other.Telefone);
	}

}
