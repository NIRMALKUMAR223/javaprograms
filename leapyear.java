import java.util.*;;
public class leapyear {

    static void leapYear(int year)
    {
        if ((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println("Leapyear");
        }
        else
        {
            System.out.println("Not A Leapyear");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        leapYear(year);
        sc.close();
    }
}
