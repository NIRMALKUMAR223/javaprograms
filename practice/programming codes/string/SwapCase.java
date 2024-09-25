public class SwapCase {
    public static void main(String[] args) {
        String str ="rAm is gOod";
        char ch[] = str.toCharArray();
        for (int i=0; i<ch.length; i++){
            if (ch[i]>='a' && ch[i]<='z'){
                ch[i]-=32;
            }
            else if (ch[i]>='A' && ch[i]<='Z'){
                ch[i]+=32;
            }
        }
        System.out.println(ch);
    }
}
