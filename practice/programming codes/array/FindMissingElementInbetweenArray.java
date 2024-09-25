public class FindMissingElementInbetweenArray {
    public static void main(String[] args) {
        int x[]={5,1,3,15};
        int small =x[0],big=x[0];
        for(int i=1;i<=x.length-1;i++)
        {
            if(x[i]<small)
                small=x[i];
            if(x[i]>big)
                big=x[i];
        }
        for(int j=small; j<=big; j++){
            if(isMissing(j,x)==false){
                System.out.println(j);
            }
        }
    }

    static boolean isMissing(int j, int[] x){
        for (int i=0; i<=x.length-1; i++){
            if (x[i]==j){
                return true;
            }
        }
        return false;
    }
}
