import java.util.Scanner;
class Bank{
	String accountUserName;
	String password;
	String fatherName;
	String motherName;
	int age;
	double accountBalance;
	Bank(String name, String pwd,String father, String mother, int a, double balance){
		accountUserName = name;
		fatherName = father;
		motherName = mother;
		age = a;
		password = pwd;
		accountBalance = balance;		
	}
}
class AccountCreation{
	static Bank createAccount(Scanner sc){
		System.out.println();
		System.out.println("=========== Create Bank Account ============");
		System.out.println();
		System.out.println("Enter Account details");
		System.out.println();
		System.out.println("Enter your name ? ");
		String name = sc.next().toUpperCase();
		System.out.println("Enter father name ? ");
		String father = sc.next().toUpperCase();
		System.out.println("Enter mother name ? ");
		String mother = sc.next().toUpperCase();
		System.out.println("Enter your age ? ");
		int age = sc.nextInt();
		System.out.println("Enter password ? ");
		String pwd = sc.next().toUpperCase();
		System.out.println("Enter first deposit amount ? ");
		double balance = sc.nextDouble();
		Bank openAccount = new Bank(name, pwd, father, mother, age, balance);
		return openAccount;
	}
}
class Authentication{
	static void verifyUser(Bank[] holders,String name, String pwd, Scanner sc){
		for (int i = 0; i < holders.length; i++){
				if (holders[i].accountUserName.equals(name.toUpperCase()) && holders[i].password.equals(pwd.toUpperCase())){
					System.out.println("============ Login Successfully ============");
					System.out.println();
					System.out.println("********************************************");
					System.out.println();
					System.out.println("========= Details of Account holder ========");
					System.out.println("Name : "+holders[i].accountUserName);
					System.out.println("Father Name : "+holders[i].fatherName);
					System.out.println("Mother Name : "+holders[i].motherName);
					System.out.println("age : "+holders[i].age);
					System.out.println();
					System.out.println("********************************************");
					System.out.println();
					System.out.println("======= Options to Handle your account =====");
					while (true){
						System.out.println();
						System.out.println("1. Deposit");
						System.out.println("2. Widthdraw");
						System.out.println("3. Check Current Balance");
						System.out.println("4. Log out");
						System.out.println("Enter you choice ... ? ");
						int choice = sc.nextInt();
						if (choice == 1){
							System.out.println("Enter the amount you want to Deposit ? ");
							int deposit = sc.nextInt();
							holders[i].accountBalance += deposit;
							System.out.println();
							System.out.println("Your account balance is "+ holders[i].accountBalance +" ... !");
							System.out.println();
						}
						else if (choice == 2){
							System.out.println("Enter the amount you want to Widthdraw ? ");
							int widthdraw = sc.nextInt();
							if (holders[i].accountBalance > widthdraw){
								holders[i].accountBalance -= widthdraw;
								System.out.println();
								System.out.println("Amount widthdraw succesfully");
								System.out.println(holders[i].accountBalance);
							}
							else{
								System.out.println();
								System.out.println("You have not enough balance ");
								System.out.println("Balance : "+ holders[i].accountBalance);
							}
						}
						else if (choice == 3){
							System.out.println();
							System.out.println("Balance : "+ holders[i].accountBalance);
						}
						else if (choice == 4){
							break;
						}
						else{
							System.out.println();
							System.out.println("Invalid input");
						}
					}
					break;
				}
		}
		System.out.println();
		System.out.println("===== Thank you for using Canara Bank ======");
		System.out.println("============== Visit Again =================");		
	}
}
class BanlAccountProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of account to be created ?");
		int count = sc.nextInt();
		Bank[] holders = new Bank[count];	
		for (int i = 0; i < count; i++){
			holders[i] = AccountCreation.createAccount(sc);
		}
		System.out.println("****** Account created succesfully *********");
		System.out.println();
		System.out.println("============== Canara Bank =================");
		System.out.println("================ Welcome ! =================");
		int i = 3;
		while (i > 0){
			System.out.println();
			System.out.println("1. Login");
			System.out.println("2. Exit");
			System.out.println("Enter your choice ? ");
			int choice = sc.nextInt();
			if (choice == 1){
				try{
					System.out.println();
					System.out.println("=========== UserName && Password ===========");
					System.out.println();
					System.out.println("Enter the user name ? ");
					String userName = sc.next();
					System.out.println("Enter the password ? ");
					String password = sc.next();
					Authentication.verifyUser(holders, userName, password, sc);
				}
				catch (Exception e){
					System.out.println();
					System.out.println("Invalid username or password");
				}
			}
			else if (choice == 2){
				break;
			}
			i--;
		}
	}
 }