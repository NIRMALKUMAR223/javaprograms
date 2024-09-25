class Vowel{
    public static void main(String[] args){
        String s="abc@123";
        int vowel = 0,cons = 0;
        for (int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            if (a>='A' && a<='Z' || a>='a' && a<='z'){
                if (a=='a' || a=='i' || a=='o'|| a=='u'|| a=='e'){
                    vowel++;
                }
                else{
                    cons++;
                }
            }
        }
        System.out.print("vowels : "+vowel +" "+ "cons :"+cons);
        
    }
}