import java.util.*;;
public class bank {
    
    static void userVerified(Scanner sc)
    {
        int choice,deposit,withdraw;
        int accountbalance=10000;
        while (true)
        {
            System.out.println();
            System.out.println("1.accountBalance");
            System.out.println("2.amountWithdraw");
            System.out.println("3.amountDeposit");
            System.out.println("4.exit");
            choice=sc.nextInt();
            if (choice==1)
            {
                System.out.println("you amount balance is "+accountbalance +".....!");
            }
            else if (choice==2)
            {
                System.out.print("Enter the amount you want to Withdraw : ");
                withdraw=sc.nextInt();
                if (withdraw<accountbalance)
                {
                    accountbalance-=withdraw;
                    System.out.println("Amount Debited...!");
                    System.out.println("Balance : "+accountbalance+".....!");
                }
                else
                {
                    System.out.println("Enter valid amount...!");
                    System.out.println("Account Balance : "+accountbalance+".....!");
                }

            }
            else if (choice==3)
            {
                System.out.print("Enter the amount you want to Deposit : ");
                deposit=sc.nextInt();
                accountbalance+=deposit;
                System.out.println("Amount Deposited Successfull...!");
                System.out.println("Balance : "+accountbalance+".....!");
            }
            else if (choice==4)
            {
                System.out.println("Thank you for using CanaraBank...!");
                break;
            }
            else
            {
                System.out.println("invalid input...!");
            }
        }
    }
    static boolean checkpin (int pin)
    {

        if (pin==1234)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin;
        int chance=3;
        int iterator=1;
        while (iterator<=chance)
        {
            System.out.println("Enter pin number");
            pin=sc.nextInt();
            if (checkpin(pin))
            {
                userVerified(sc);
            }
            else
            {
                System.out.println("invalid pin...!");
                iterator++;
            }
        }
        sc.close();
    }
}