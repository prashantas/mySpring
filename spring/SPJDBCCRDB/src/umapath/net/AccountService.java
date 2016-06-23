package umapath.net;

public interface AccountService {

	public void addAccount(Account a);
	public double deposit(int accno, double amt);
	public double withdraw(int accno, double amt);
	public void transferfunds(int saccno,int daccno,double amt);
	
}
