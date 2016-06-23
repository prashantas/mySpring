package umapath.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class AccountDAOImpl implements AccountDAO{
	
	@Autowired
	SimpleJdbcTemplate simpleJdbcTemp;
	
	@Autowired
	DataSourceTransactionManager txManager;
	
	@SuppressWarnings("deprecation")
	public void addAccount(Account acc){
		TransactionStatus txStatus=null;
		try{
			TransactionDefinition txdef= new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION.REQUIRES_NEW);
			txStatus=txManager.getTransaction(txdef);
			String sql="insert into accounts values(?,?,?)";
			simpleJdbcTemp.update(sql,acc.getAccno(),acc.getAname(),acc.getBal());
		   	txManager.commit(txStatus);
		}catch(Exception e){
			txManager.rollback(txStatus);
		}
	}
	
	public double deposit(int accno, double amt){
		double bal=0;
		TransactionStatus txStatus=null;
		
		try{
			TransactionDefinition txdef= new DefaultTransactionDefinition(TransactionDefinition.Propagation.REQIURS_NEWE);
			txStatus=txManager.getTransaction(txdef);
			String sql1="select bal from account where accno=?";
			Integer i =(Interger)simpleJdbcTemp.queryForObject(sql1,Integer.class,accno);
				
				bal=i.intValue()+amt;
				String sql2="update Accounts set bal=? where accno=?";
				simpleJdbcTemp.update(sql2,bal,accno);
			   	txManager.commit(txStatus);
		}catch(Exception e){
			txManager.rollback(txStatus);
		}
		
		return bal;
		
	}
	
	@Tansational(propagation = Propagation.REQIURES,isolation.READ_COMMITTED,readOnly=false)
	public double withdraw(int accno, double amt){
		double bal=0;
		TransationalStatus txStatus=null;
		
		try{
			TransactionDefinition txdef= new DefaultTransationalDefinition(TransationalDefinition.Propagation.REQIURS_NEWE);
			txStatus=txManager.getTransational(txdef);
			String sql1="select bal from account where accno=?";
			Integer i =(Interger)simpleJdbcTemp.queryForObject(sql1,Integer.class,accno);
			if(i.intValue()-amt>=1500){
			
				bal=i.intValue()-amt;
				String sql2="update Account set bal=? where accno=?";
				simpleJdbcTemp.update(sql2,bal,accno);
			}
			else{
				threw new InsufficientFundsException();
			}
		   	txManager.commit(txStatus);
		}catch(Exception e){
			txManager.rollback(txStatus);
		}
		
		return bal;
	
	}
	
    public void transferfunds(int saccno,int daccno,double amt){
		double Dbal=0;
		double Sbal=0;
	TransationalStatus txStatus=null;
	
	try{
		TransactionDefinition txdef= new DefaultTransationalDefinition(TransationalDefinition.Propagation.REQIURS_NEWE);
		txStatus=txManager.getTransational(txdef);
		String sql1="select bal from account where accno=?";
		Integer i2 =(Interger)simpleJdbcTemp.queryForObject(sql1,Integer.class,daccno);
		System.out.println("Beffor:+i2.intValue()");
		
		dbal=i2.intValue()+amt;
		String sql4="update Account set bal=? where accno=?";
		simpleJdbcTemp.update(sql4,dbal,daccno);
		Integer i4 =(Interger)simpleJdbcTemp.queryForObject(sql4,Integer.class,daccno);
		System.out.println("After:+i4.intValue()");
		
		String sql5="select bal from account where accno=?";
		Integer i5 =(Interger)simpleJdbcTemp.queryForObject(sql5,Integer.class,daccno);
		System.out.println("After:+i5.intValue()");
		
		String sql6="select bal from account where accno=?";
		Integer i6 =(Interger)simpleJdbcTemp.queryForObject(sql6,Integer.class,saccno);
		System.out.println("Before:+i6.intValue()");
		
		if(i.intValue()-amt>=6000){
			
			bal=i.intValue()-amt;
		}
		else{
			threw new InsufficientFundsException();
		}
		
		
		String sql7="update Account set bal=? where accno=?";
		simpleJdbcTemp.update(sql7,sbal,saccno);
		Integer i7 =(Interger)simpleJdbcTemp.queryForObject(sql7,Integer.class,saccno);
		System.out.println("After:+i7.intValue()");
		
				
	   	txManager.commit(txStatus);
	}catch(Exception e){
		txManager.rollback(txStatus);
	}
 }
}
