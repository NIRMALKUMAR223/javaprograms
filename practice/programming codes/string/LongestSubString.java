public class LongestSubString {
    public static void main(String[] args) {
        String str = "scanner";
        String longest ="";
        for (int i=0; i<str.length(); i++){
            for ( int j=i+1; j<=str.length(); j++){
                String string = str.substring(i,j); 
                if (isUnique(string)){
                    if (string.length()> longest.length()){
                        longest=string;
                    }
                }
            }
        }
        System.out.println(longest);
    }
    static boolean isUnique(String str){
        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}