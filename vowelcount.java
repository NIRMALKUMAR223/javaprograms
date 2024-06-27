import java.util.*;
public class vowelcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        char ch;
        int count=0;
        str=sc.nextLine().toLowerCase();
        for (int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
