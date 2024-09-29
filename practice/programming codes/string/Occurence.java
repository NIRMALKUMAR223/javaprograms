public class Occurence {
    public static void main(String[] args) {
        String str = "aaabbbccaa";
        char ch[] = str.toCharArray();
        for (int i=0; i<ch.length; i++){
            if(ch[i]!='0'){
                int count = 1;
                for (int j=i+1; j<ch.length; j++){
                    if (ch[i]!=ch[j]){
                        break;
                    }
                    else{
                        count++;
                        ch[j]='0';
                    }
                }
                System.out.print(ch[i]+""+count);
            }
        }
    }
}
