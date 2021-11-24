package pos_mavem.POO.CRUDaluno.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import pos_mavem.POO.CRUDaluno.HibernateUtil;

public class GenericDAO<E>{

	private EntityManager entitymanager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		try {
		
		EntityTransaction transaction = entitymanager.getTransaction();
		
		transaction.begin();
		entitymanager.persist(entidade);
		
		transaction.commit();
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			entitymanager.close();
		
			
		}
	}
	
}

