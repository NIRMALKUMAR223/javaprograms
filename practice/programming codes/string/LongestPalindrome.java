public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abacbbca";
        String longest ="";
        for (int i=0; i<str.length(); i++){
            for ( int j=i+1; j<str.length(); j++){
                String string = str.substring(i,j); 
                boolean sub = isPal(string);
                if (sub){
                    if (string.length()>longest.length()){
                        longest = string;
                    }
                }
            }
        }
        System.out.println(longest);
    }
    static boolean isPal(String string){
        String rev = new StringBuilder(string).reverse().toString();
        return string.equals(rev);
    }   
}
