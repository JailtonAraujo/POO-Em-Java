package pos_mavem.POO.CRUDaluno.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import pos_mavem.POO.CRUDaluno.HibernateUtil;

public class PessoaDAO<E>{

	private EntityManager entitymanager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		EntityTransaction transaction = entitymanager.getTransaction();
		
		transaction.begin();
		entitymanager.persist(entidade);
		
		transaction.commit();
		
		entitymanager.close();
		
	}
	
}

