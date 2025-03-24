package bank;

public class BankAccount2 {
	static String bankName;
	static String branchName;
	static String ifsc;
	
	long accNum;
	String accHName;
	double balance;
	
	static void setBankDetals(String bankN,String branchN, String ifscc) {
		bankName=bankN;
		branchName=branchN;
		ifsc=ifscc;
	}
		void setAccDetails(long accN, String accHN, double bal) {
		accNum = accN;
		accHName = accHN;
		balance = bal;
		
		}
		void deposit(double amt) {
		 balance = balance+amt;
		 alart(amt, " is Credited");
		}
		void withdrow(double amt) {
			balance = balance - amt;
			alart(amt," is Debited");
		}
		private void alart(double amt, String msg) {
			System.out.println(amt+msg+" in your account");
			System.out.println("Available balance is \t :"+balance);
		}
		void display() {
			System.out.println("Bank Name \t : "+ bankName);
			System.out.println("Branch Name \t : "+ branchName);
			System.out.println("IFSC \t : "+ ifsc);
			System.out.println("Account Holder Name \t : "+accHName);
			System.out.println("Account Number \t : "+accNum);
			System.out.println("Current Balance \t : "+balance);
			
		}
	
				
	}
	
