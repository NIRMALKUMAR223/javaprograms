class CountString{
    public static void main(String[] args){
        String str = "helloworld";
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (ch[i]!='0'){
                int count = 1;
                for (int j = i+1 ; j < ch.length; j++){
                    if (ch[i]==ch[j]){
                        count++;
                        ch[j]='0';
                    }
                }
                System.out.print(ch[i]+" = "+count +"   ");
            }
        }
    }
}