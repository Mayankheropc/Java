
public class SavingsAccount
{
	private double balance;
	private double interest;

	public SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}

public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		SavingsAccount mayanksSavings = new SavingsAccount(1000, 0.10);
		mayanksSavings.withdraw(250);
		mayanksSavings.deposit(400);
		mayanksSavings.addInterest();
		System.out.println(mayanksSavings.getBalance());
		System.out.println("Expected: 1265.0");
		//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
	}
}
