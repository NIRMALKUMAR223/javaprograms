class Accenture2{
    public static void main(String[] args) {
        String str ="helleo";
        int len = str.length();
        String s = "l";
        int count=0;
        char ch1[] = str.toCharArray();
        char ch2[] = s.toCharArray();
        for (int i=0; i<len; i++){
            if (ch1[i]==ch2[0]){
                count++;
            }
        }
        System.out.println(count);
    }
}