public class Palindrome1 {
    public static void main(String[] args) {
        int number = 121;
        int orignal =  number;
        int result = 0;
        while (number!=0){
            int last = number%10;
            result = result* 10 + last;
            number/=10;
        }
        if (number==orignal){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
