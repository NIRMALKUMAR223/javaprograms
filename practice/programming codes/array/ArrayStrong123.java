import java.util.Scanner;

public class ArrayStrong123 {
    public static int  arrayCheckFact(int number){
        int fact =1;
        for (int i =1;i<=number;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static boolean arrayCheckStrong(int number){
        int orignal = number;
        int result = 0;
        while (number!=0){
            int last = number %10;
            result = result + arrayCheckFact(last);
            number/=10;
        }
        return orignal==result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number o element you want to insert ? ");
        int number = sc.nextInt();
        int arr[] = new int[number];
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("Enter number ?");
            arr[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(arrayCheckStrong(arr[i])){
                sum = sum + arr[i];       
            };
        }
        System.out.println("sum : "+ sum);
        sc.close();
    }
}