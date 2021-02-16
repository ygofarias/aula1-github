package entities;

public class Account {
		private int numberAccount;
		public String holderName;
		private double balance;
		
		public Account() {
			
		}
		public Account(int numberAccount, String holderName, double initialDeposit) {
			super();
			this.numberAccount = numberAccount;
			this.holderName = holderName;
			//caso mude a regra de negócio, muda apenas o método e não construtor
			deposit(initialDeposit);			
		}
		public Account(int numberAccount, String holderName) {
			super();
			this.numberAccount = numberAccount;
			this.holderName = holderName;
					
		}
		public String getHolderName() {
			return holderName;
		}
		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}
		public int getNumberAccount() {
			return numberAccount;
		}
		public double getBalance() {
			return balance;
		}
		
		public void deposit(double amount) {
			balance += amount;			
		}
		public void withDraw(double amount) {
			balance -= amount + 5.0;
		}
		public String toString() {
			return "Account "
					+numberAccount 
					+ " , "
					+ "Holder: " 
					+ holderName 
					+ " , balance: $"
					+ String.format("%.2f", balance);
					
		}
}
