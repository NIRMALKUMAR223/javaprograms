import java.util.Scanner;
public class AbAbc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        for (int i =1; i <=number;i++){
            char c = 'A';
            for (int j=1; j <=i; j++){
                System.out.print(c +" ");
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}
