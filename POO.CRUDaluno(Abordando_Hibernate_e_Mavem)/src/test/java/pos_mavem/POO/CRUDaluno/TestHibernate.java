package pos_mavem.POO.CRUDaluno;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import pos_mavem.POO.CRUDaluno.Controllers.AlunoController;
import pos_mavem.POO.CRUDaluno.DAO.GenericDAO;
import pos_mavem.POO.CRUDaluno.MODEL.Aluno;
import pos_mavem.POO.CRUDaluno.MODEL.Contato;
import pos_mavem.POO.CRUDaluno.MODEL.Pessoa;
import pos_mavem.POO.CRUDaluno.MODEL.Professor;


public class TestHibernate {

	@Test
	public void TesteHibernateUtil() {

		Aluno aluno = new Aluno(0, "5i4654", "45kj64564", "564kjh564", "445jk4", "jk6464564", "4jk65465","jk545456", "465465", "65456456");
		
		//aluno.setNome("jailton");
		//aluno.setCPF("54654564");
		//aluno.setNomeMae("maria");
		
		
		Contato contato = new Contato();
		contato.setTelefone("5465456");
		contato.setEmail("5465456");
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		contato.setPessoa(aluno);
		contatos.add(contato);
		
		aluno.setContato(contatos);
		
		GenericDAO<Aluno> dao = new GenericDAO<Aluno>();
		
		dao.salvar(aluno);
		
		
		

	}
	
	@Test
	public void TesteClasseProfesssor() {
		
		Professor professor = new Professor(0, "Lucas", "456456", "gfdg", "fsdfds", "fdsfdsf", "fdsfds", "fdfsd", "gfdgfdg");
		
		
		
		//aluno.setNome("jailton");
		//aluno.setCPF("54654564");
		//aluno.setNomeMae("maria");
		
		
		Contato contato = new Contato();
		contato.setTelefone("4544654");
		contato.setEmail("dsfdsfsdf");
		contato.setPessoa(professor);
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		contatos.add(contato);
		
		professor.setContato(contatos);
		
		GenericDAO<Professor> dao = new GenericDAO<Professor>();
		
		dao.salvar(professor);
		
		
		
		
		

	}
	

	@Test
	public void TestarListar() {
		GenericDAO dao = new GenericDAO();

		List<Aluno> lis = dao.Listar(Aluno.class);

		for (Aluno contato : lis) {
			System.out.println(contato);
			System.out.println("=================");
		}

	}

	@Test
	public void TestarExcluir() {
		GenericDAO<Aluno> dao = new GenericDAO<Aluno>();
		
		Aluno aluno = new Aluno();
		aluno.setID(7);
		
		Contato contato = new Contato();
		contato.setPessoa(aluno);
		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);
		aluno.setContato(contatos);
		
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

		List<Aluno> lis = dao.Pesquisa(Aluno.class,"");

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
