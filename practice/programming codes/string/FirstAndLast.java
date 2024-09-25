public class FirstAndLast {
    public static void main(String[] args) {
        String str ="ram is good";
        int count =0;
        char ch[] = str.toCharArray();
        for (int i=0; i<ch.length; i++){
            // if (i == 0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ' ){
            if ((i==0 || ch[i-1]==' ')&& ch[i]!=' '){
                count++;
                ch[i] -=32;
            }
        }
        System.out.println(ch);
        System.out.println("count : "+count);
    }
}
