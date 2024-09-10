import java.util.*;
public class program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine().toLowerCase();
        switch (choice)
        {
            case "monday":
            case "wednesday":System.out.println("Basket Ball");break;
            case "tuesday":
            case "friday":System.out.println("Tennis");break;
            case "thusday":System.out.println("Cricket");break;
            case "Saturday":System.out.println("Excerise");break;
            case "sunday":System.out.println("Holiday");break;
            default :System.out.println("Invalid input");
        }
        sc.close();
    }
}
