public class CheckingAccount  { 

private static final double FEE = 0.15; 

public CheckingAccount(String name, double initialAmount) { 

super(name, initialAmount); 

setAccountNumber(getAccountNumber() + "-10"); 

} 

private String getAccountNumber() {
	// TODO Auto-generated method stub
	return null;
}

public boolean withdraw(double amount) { 

amount += FEE; 

return super.withdraw(amount); 

} 

} 