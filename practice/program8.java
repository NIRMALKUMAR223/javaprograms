import java.util.*;
public class program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        int evencount,evenmultiple,count;
        count=evencount=0;
        evenmultiple=1;
        for (int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]%2==0)
            {
                count+=1;
                evencount+=arr[i];
                evenmultiple*=arr[i];
            }
        }
        switch (count)
        {
            case 1:System.out.println("Even");break;
            case 2:System.out.println(evencount);break;
            case 3:System.out.println(evenmultiple);break;
            default:System.out.println(0);
        }
        sc.close();
    }
}
