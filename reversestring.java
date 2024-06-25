import java.util.Scanner;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,rev="";
        str=sc.next();
        for (int i=0;i<str.length();i++)
        {
            rev=str.charAt(i)+rev;
        }
        if (str==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
