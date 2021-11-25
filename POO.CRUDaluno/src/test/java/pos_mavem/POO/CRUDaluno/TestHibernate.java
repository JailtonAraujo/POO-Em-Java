package pos_mavem.POO.CRUDaluno;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

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
	public void TestarListar() {
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
		
		Aluno aluno = new Aluno();
		aluno.setID(2);
		
		dao.Excluir(aluno);
	}
	
	@Test
	public void TestarAtualizar() {
		GenericDAO<Aluno> dao = new GenericDAO<Aluno>();
		
		Aluno aluno = new Aluno();
		
		aluno.setID(3);
		aluno.setNome("jjasd");;
		aluno.setCPF("asdasd");
		aluno.setRG("asdsdasd");
		aluno.setDataNascimento("asddfdsasd");
		aluno.setNomeMae("asdafsd");
		aluno.setNomeMae("dsad");
		aluno.setDataMatricula("asddfasd");
		aluno.setNomeEscola("afdsdasd");
		aluno.setSerieMatriculado("asffdasd");
		
		//System.out.println(aluno);
		
		//dao.Atualizar(aluno);
		
		//System.out.println(dao.Atualizar(aluno));
	}
	
	
	@Test
	public void TestarPesquisa() {
		GenericDAO<Aluno> dao = new GenericDAO<Aluno>();

		List<Aluno> lis = dao.Pesquisa(Aluno.class,"j");

		for (Aluno aluno : lis) {
			System.out.println(aluno);
			System.out.println("=================");
		}

	}
	
	@Test
	public void TestPesquisa() {
		GenericDAO<Aluno> dao = new GenericDAO<Aluno>();
		
		List<Aluno> lis =  dao.getEntityManager().createQuery("from "+Aluno.class+"").getResultList();
		
		for (Aluno aluno : lis) {
			System.out.println(aluno);
			System.out.println("=================");
		}
		
	}

}
