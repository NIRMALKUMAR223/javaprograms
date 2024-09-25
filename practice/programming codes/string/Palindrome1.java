public class Palindrome1 {
    public static void main(String[] args) {
        // String str = "gadaj";
        // // String sb = new StringBuilder(str).reverse().toString();
        // // System.out.println((str.equals(sb))?"palindrome":"not palindrome");
        // System.out.println(((str.equals(new StringBuilder(str).reverse().toString()))?"palindrome":"not palindrome"));


    }

    public static boolean isPall(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
