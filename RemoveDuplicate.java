import java.util.Arrays;
class RemoveDuplicate{
    
    static int[] removeDuplicate(int[] oldarr){
        int[] newarray = new int[oldarr.length];
        newarray[0] = oldarr[0];
        int k = 1;
        for (int i=0; i<oldarr.length; i++){
            int j=0;
            for ( ; j<k; j++){
                if (oldarr[i] == newarray[j]){
                    break;
                }
            }
            if (j==k){
                newarray[k]=oldarr[i];
                k++;
            }
        }
        newarray = Arrays.copyOf(newarray, k);
        return newarray;
        
    }
    
    public static void main(String[] args){
        int[] arr = {4, 5, 9, 1, 5, 9, 3, 4, 6};
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        arr = removeDuplicate(arr);
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}