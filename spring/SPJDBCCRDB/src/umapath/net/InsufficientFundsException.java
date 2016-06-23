package umapath.net;

public class InsufficientFundsException  extends RuntimeException{

	public String tostring(){
		return "Sorry... Your account has Insufficient Funds";
	}
}
