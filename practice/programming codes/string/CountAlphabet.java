public class CountAlphabet {
    public static void main(String[] args) {
        String str = "EXDRhel@!123loworld^%$#45678ZSCFVTB";
        char ch[] = str.toCharArray();
        int small=0,big=0,special=0,integer=0;
        for (int i=0; i<ch.length; i++){
            if (ch[i]>='a' && ch[i]<='z'){
                small++;
            }
            else if(ch[i]>='0' && ch[i]<='9'){
                integer++;
            }
            else if(ch[i]>='A' && ch[i]<='Z'){
                big++;
            }
            else{
                special++;
            }
        }
        System.out.println("small : "+small +" big : "+big+" special : "+special+" integer : "+integer);
    }
}