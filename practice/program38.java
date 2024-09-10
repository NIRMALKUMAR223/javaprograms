import java.util.Scanner;

public class program38 {

    public static void swapString(String str1,String str2){
        String result = "";
        int i =0;
        for (  ; i<str1.length() && i<str2.length();i++){
            result = result + str1.charAt(i) + str2.charAt(i);
        }
        while(i<str1.length()){
            result+=str1.charAt(i++);
        }
        while(i<str2.length()){
            result+=str2.charAt(i++
            );
        }
        System.out.println("result : "+result);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 ?");
        String string1 = sc.next();
        System.out.println("Enter the string 2 ?");
        String string2 = sc.next();
        swapString(string1,string2);
    }
    
}
