import java.lang.reflect.Array;

class Testtttt{
        public static void main(String[] args) {
            String s[] ={"file_3","file_5","file_9"};
            int max=0;
            if (s.length!=0){
                for (int i=0; i<s.length; i++){
                    char sample[] = s[i].toCharArray();
                    for (int j=0; j<sample.length; j++){
                        if (sample[j] >= 48 && sample[j]<=57){
                            if (sample[j]>max){
                                max=sample[j];
                            }
                        }
                    }
                }
            }
            else{
                System.out.println(-1);
            }
            System.out.println((char)max);
        }
    }
