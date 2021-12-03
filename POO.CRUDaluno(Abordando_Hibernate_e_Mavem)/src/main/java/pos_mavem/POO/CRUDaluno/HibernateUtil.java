package pos_mavem.POO.CRUDaluno;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManagerFactory factory = null;
		
	static {
		init();
	}
	
	private static void init() {
		
		
		try {
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("POO.CRUDaluno");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
		
	}
	
	public static Object getPrimaryKey (Object entity) {  //RETORNA O IDENTIFICADOR DA ENTIDADE PASSDA//
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
	
}