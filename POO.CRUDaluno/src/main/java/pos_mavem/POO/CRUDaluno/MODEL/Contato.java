package pos_mavem.POO.CRUDaluno.MODEL;


import java.util.List;
import java.util.Objects;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Contato{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Telefone;
	private String Email;

	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pessoa_fk")
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
		return "Contato [Id=" + Id + ", Telefone=" + Telefone + ", Email=" + Email + ", pessoa=" + "]";
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
