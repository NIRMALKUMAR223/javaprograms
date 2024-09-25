class LastWord{
    public static void main(String[] args) {
        String str = "hello hello world";
        char ch[] = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            if(ch[i]==' '&& ch[i-1]!=' ' || (i==ch.length-1)){
                ch[i-1]-=32;
            }
        }
        System.out.println(ch);
    }
}