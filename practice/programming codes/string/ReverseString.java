public class ReverseString {
    public static void main(String[] args){
        String str = "helloworld";
        
        // StringBuilder rev = new StringBuilder(str).reverse();
        // System.out.println(rev);

        System.out.println(new StringBuilder(str).reverse());
    }
}
