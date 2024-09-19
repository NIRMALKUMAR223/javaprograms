import java.util.Arrays;
import java.util.Scanner;

class TestArray{
    public static void main(String[] args) {
        // Object o[] = new Object[4];
        // o[0]='a';
        // o[1]=123;
        // o[2]="asdfg";
        // o[3]=123.1;
        // for (Object i:o){
        //     System.out.println(i);
        // }
    //     for (int i=2;i<=100;i++){
    //         isPrime(i);
    //     }

    // }
    // public static void isPrime(int a){
    //     if(a<=1){
    //         System.out.println("not Prime " + a);
    //     }
    //     for (int i = 2; i <= a; i++){
    //             if (a%i==0){
    //                 break;
    //             }
    //         }
    //     System.out.println("prime "+ a);
     

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("enter elements ");
        for(int i=0; i<=arr1.length-1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        sc.close();

    }
}