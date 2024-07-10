public class RemoveDuplicateSort {
    
    static void sortRemoveDuplicate(int[] arr){
        int[] array = new int[arr.length];
        array[0] = arr[0];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
                if (arr[i] > array[k])
                {
                    k++;
                    array[k] = arr[i];
                }
        }
        for (int i : array){
            if (i == 0){
                continue;
            }
            else{
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        int[] a={2,3,3,4,6,6,6,7,10};
        sortRemoveDuplicate(a);
    }
}
