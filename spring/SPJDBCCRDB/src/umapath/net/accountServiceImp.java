package umapath.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class accountServiceImp  implements AccountService{
	

	@Autowired
	AccountDAO accountDao=null;

	public void setAccountDao(AccountDAO accountDao) {
		this.accountDao = accountDao;
	}
		
	public void addAccount(Account a){
		
		accountDao.addAccount(a);
	}
	
	@Transactional(propagation = Propagation.MANDATORY, isolation=Isolation.READ_COMMITTED, readOnly=false)
	public double deposit(int accno, double amt){
		return accountDao.deposit(accno,amt);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public double withdraw(int accno, double amt){
		return accountDao.withdraw(accno,amt);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public void transferfunds(int saccno,int daccno,double amt){
		accountDao.transferfunds(saccno,daccno,amt);
	}
	
	
}
	
	
	
	