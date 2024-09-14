import java.util.Scanner;
class ArrayHomeWork1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element you want to insert ? ");
        int number = sc.nextInt();
        int arr[] = new int[number];
        for (int i=number-1;i>=0;i--){
            System.out.println("Enter number ?");
            arr[i]=sc.nextInt();
        }
        for(int iter: arr){
            System.out.print(iter+" ");
        }
        sc.close();
    }
}