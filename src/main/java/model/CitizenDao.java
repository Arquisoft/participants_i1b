package model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CitizenDao{

	  @Autowired
	  private SessionFactory session;
	  
	  private Session getSession() {
	    return session.getCurrentSession();
	  }

	  public void save(Citizen citizen) {
	    getSession().save(citizen);
	  }
	  
	  public void delete(Citizen citizen) {
	    getSession().delete(citizen);
	  }
	  
	  public Citizen getById(long id) {
		    return (Citizen) getSession().load(Citizen.class, id);
	  }

	  public void update(Citizen citizen) {
	    getSession().update(citizen);
	  }
	  
	  public Citizen findByEmail(String email) {
		    return (Citizen) getSession().createQuery(
		        "from User where email = :email")
		        .setParameter("email", email)
		        .uniqueResult();
	  }

}