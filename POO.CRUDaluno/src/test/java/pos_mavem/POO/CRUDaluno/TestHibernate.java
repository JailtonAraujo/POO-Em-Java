package pos_mavem.POO.CRUDaluno;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pos_mavem.POO.CRUDaluno.DAO.GenericDAO;
import pos_mavem.POO.CRUDaluno.MODEL.Aluno;
import pos_mavem.POO.CRUDaluno.MODEL.Pessoa;

public class TestHibernate {

	@Test
	public void TesteHibernateUtil() {

		// HibernateUtil.getEntityManager();

		GenericDAO dao = new GenericDAO();

		Aluno aluno = new Aluno(0, "sagdsf", "agsdf", "46g5554", "1012g5/10", "Jogse", "gMaia", "4 duglo", "IBAg",
				"mghj");

		dao.salvar(aluno);

	}

	@Test
	public void TestarConsulta() {
		GenericDAO<Aluno> dao = new GenericDAO<Aluno>();

		List<Aluno> lis = dao.Listar(Aluno.class);

		for (Aluno aluno : lis) {
			System.out.println(aluno);
			System.out.println("=================");
		}

	}

	@Test
	public void TestarExcluir() {
		GenericDAO<Aluno> dao = new GenericDAO<Aluno>();
		
		dao.Excluir(Aluno.class, 2);
	}

}
