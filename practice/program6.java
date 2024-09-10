import java.util.Scanner;
class program6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) 
        {
            case 1:System.out.println("Sunday");break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("Tuesday");break;
            case 4:System.out.println("wednesday");break;
            case 5:System.out.println("Thusday");break;
            case 6:System.out.println("Friday");break;
            default:System.out.println("Invalid value");
        }
        sc.close();
    }
}