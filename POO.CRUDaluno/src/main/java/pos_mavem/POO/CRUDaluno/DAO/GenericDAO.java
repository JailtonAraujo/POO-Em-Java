package pos_mavem.POO.CRUDaluno.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;
import javax.transaction.Transaction;

import com.mysql.cj.Query;

import pos_mavem.POO.CRUDaluno.HibernateUtil;
import pos_mavem.POO.CRUDaluno.MODEL.Aluno;

public class GenericDAO<E>{

	

	public void salvar(E entidade) {
		try {

			EntityManager entitymanager = HibernateUtil.getEntityManager();//ABRINDO CONEXÃO
			
			EntityTransaction transaction = entitymanager.getTransaction();

			transaction.begin();
			entitymanager.persist(entidade);

			transaction.commit();
			
			entitymanager.close();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public List<E> Listar(Class<E> entidade) {
		
		try {
			
		EntityManager entitymanager = HibernateUtil.getEntityManager();	//ABRINDO CONEXÃO
			
		EntityTransaction transaction = entitymanager.getTransaction();

		transaction.begin();
		
		List<E> alunos = entitymanager.createQuery("from "+entidade.getName()+"").getResultList();
		
		transaction.commit();
		
		entitymanager.close();
		
		return alunos;
		
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
	
	
	public void Excluir(Class aluno, int id) {
		
		EntityManager entitymanager = HibernateUtil.getEntityManager();	//ABRINDO CONEXÃO
		
		EntityTransaction transaction = entitymanager.getTransaction();
		
		aluno = entitymanager.find(aluno.getClass(), id); 
		
		entitymanager.remove(aluno);
		
		transaction.commit();
		
		entitymanager.close();
		
		
		
	}

}
