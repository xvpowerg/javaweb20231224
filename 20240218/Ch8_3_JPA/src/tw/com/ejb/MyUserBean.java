package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.jpa.MyUser;

@Stateless
public class MyUserBean implements MyUserBeanLocal{
	@Inject
	private EntityManager em;
	@Override
	public boolean login(MyUser myuser) {
		// TODO Auto-generated method stub
		return findUserByAccAndPwd(myuser.getAccount(),myuser.getPassword()) != null;
	}

	@Override
	public boolean register(MyUser myuser) {
		// TODO Auto-generated method stub
		try {
			em.persist(myuser);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		
		return false;
	}

	@Override
	public MyUser findUserByAccAndPwd(String account, String password) {
		// TODO Auto-generated method stub
		MyUser myUser = null;

		try {
			TypedQuery<MyUser>  query = em.createNamedQuery("findMyUser",MyUser.class);
			query.setParameter("account", account);
			query.setParameter("password", password);
			myUser = query.getSingleResult();
			return myUser;
		}catch(Exception ex) {
			System.out.println("findUserByAccAndPwd:"+ex);
		}
		
		return null;
	}

	@Override
	public boolean deleteUser(MyUser myUser) {
		// TODO Auto-generated method stub
		try {
			myUser = em.merge(myUser);
			em.remove(myUser);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
		}
	
		return false;
	}

}
