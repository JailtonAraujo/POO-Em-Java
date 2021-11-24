package pos_mavem.POO.CRUDaluno;

import org.junit.Test;

import pos_mavem.POO.CRUDaluno.DAO.GenericDAO;
import pos_mavem.POO.CRUDaluno.MODEL.Aluno;
import pos_mavem.POO.CRUDaluno.MODEL.Pessoa;



public class TestHibernate {

	@Test
	public void TesteHibernateUtil() {
		
		//HibernateUtil.getEntityManager();
		
		GenericDAO<Pessoa> dao = new GenericDAO<Pessoa>();
		
		
		Aluno aluno = new Aluno(0, "sadsf", "asdf", "465554", "10125/10", "Jose", "Maia", "4 dulo", "IBA", "mhj");
		
		dao.salvar(aluno);
		
		
		
		
		
	}
}
