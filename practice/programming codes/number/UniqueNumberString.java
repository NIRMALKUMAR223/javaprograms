import java.util.Scanner;

public class UniqueNumberString {
    public static boolean checkUnique(int number){
        String string = Integer.toString(number);
        for (int i = 0; i<string.length();i++){
            for (int j = i+1; j<string.length();j++){
                if (string.charAt(i) == string.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        if (checkUnique(number)){
            System.out.println("Unique");
        }
        else{
            System.out.println("Not Unique");
        }
        sc.close();
    }
}
