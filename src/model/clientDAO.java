package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import java.util.List;

import org.hibernate.Query;

import entity.CLIENT;
@Component
public class clientDAO {
@Autowired
SessionFactory factory;
	@Transactional
	public CLIENT getCli(String username) {
		Session session = factory.getCurrentSession();
		String hql = "from CLIENT where username=:username";
		Query query = session.createQuery(hql);
		query.setParameter("username", username);
		CLIENT cli = (CLIENT) query.uniqueResult();
		return cli;
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public  boolean checkLogin(String username, String password) {
		Session session = factory.openSession();
		String hql = "from CLIENT where Username= :username  and Password=:password ";
		Query query = session.createQuery(hql);
		query.setParameter("username", username);
		query.setParameter("password", password);
		List<CLIENT> lstCli = query.list();
		if (lstCli.size() > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean insertCli(String username,String password,String repassword,String email) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		try {		
		CLIENT cli = new CLIENT(username, repassword, null, false, null, email, null, null, "client");
		session.save(cli);
		tr.commit();
		return true;		
		}catch(Exception e){
			tr.rollback();
			e.printStackTrace();
			return false;			
		}finally {
			session.close();
		}
	}
}
