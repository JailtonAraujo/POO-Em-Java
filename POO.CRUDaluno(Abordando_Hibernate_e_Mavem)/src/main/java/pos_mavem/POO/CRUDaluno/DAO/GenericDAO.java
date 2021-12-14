package pos_mavem.POO.CRUDaluno.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;
import javax.transaction.Transaction;

import com.mysql.cj.Query;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import pos_mavem.POO.CRUDaluno.HibernateUtil;
import pos_mavem.POO.CRUDaluno.MODEL.Aluno;

public class GenericDAO<E> {
	static int id;
	public void salvar(Aluno entidade) {
		
	
		try {

			
			EntityManager entitymanager = HibernateUtil.getEntityManager();// ABRINDO CONEXÃO

			EntityTransaction transaction = entitymanager.getTransaction();

			
			transaction.begin();
			
			
			entitymanager.persist(entidade);
			//entitymanager.persist(entidade.getContatos());
			
			transaction.commit();

			
			entitymanager.close();
	
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public List<E> Listar(Class<E> entidade) {

		try {

			EntityManager entitymanager = HibernateUtil.getEntityManager(); // ABRINDO CONEXÃO

			EntityTransaction transaction = entitymanager.getTransaction();

			transaction.begin();

			List<E> entidades = entitymanager.createQuery("from " + entidade.getName() + "").getResultList();

			transaction.commit();

			entitymanager.close();
			

			return entidades;

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}

	public void Excluir(E entidade) {

		try {

			EntityManager entitymanager = HibernateUtil.getEntityManager(); // ABRINDO CONEXÃO

			Object id = HibernateUtil.getPrimaryKey(entidade);

			EntityTransaction transaction = entitymanager.getTransaction();

			transaction.begin();
			
			//entitymanager.remove(entidade);
			
			entitymanager
					.createNativeQuery(
							"delete from " + entidade.getClass().getSimpleName().toLowerCase() + " where id = " + id)
					.executeUpdate();
	
			transaction.commit();

			entitymanager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public E Atualizar(E entidade) {
		try {

			EntityManager entitymanager = HibernateUtil.getEntityManager();// ABRINDO CONEXÃO

			EntityTransaction transaction = entitymanager.getTransaction();

			transaction.begin();
			E enti = entitymanager.merge(entidade);

			transaction.commit();

			entitymanager.close();

			return enti;

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}

	}

	public List<E> Pesquisa(Class<E> entidade, String search) {

		try {

			EntityManager entitymanager = HibernateUtil.getEntityManager(); // ABRINDO CONEXÃO


			EntityTransaction transaction = entitymanager.getTransaction();

			transaction.begin();

			List<E> entidades = entitymanager.createQuery("from " + entidade.getName() + " where nome like '"+search+"%'").getResultList();

			transaction.commit();
		
			entitymanager.close();
			
			return entidades;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	
	public EntityManager getEntityManager () {
		EntityManager entitymanager = HibernateUtil.getEntityManager();
		return entitymanager;
	}
}
