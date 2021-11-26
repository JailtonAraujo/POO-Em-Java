package pos_mavem.POO.CRUDaluno.MODEL;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contato implements Serializable {
	@Id
	private int Id;
	@Column(nullable = false)
	private String Telefone;
	@Column(nullable = false)
	private String Email;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Pessoa pessoa;

	public Contato() {
	}

	public Contato(String telefone, String email) {
		Telefone = telefone;
		Email = email;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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
		return "Contato [Id=" + Id + ", Telefone=" + Telefone + ", Email=" + Email + ", pessoa=" + pessoa + "]";
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
