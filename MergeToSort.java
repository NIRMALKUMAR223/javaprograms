class MergeToSort{
    static void merge (int[] a1, int[] a2){
        int[] arr = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length){
            if (a1[i] < a2[j]){
                arr[k] = a1[i];
                k++;
                i++;
            }
            else{
                arr[k] = a2[j];
                k++;
                j++;
            }
        }
        while (i < a1.length){
            arr[k] = a1[i];
            k++;
            i++;
        }
        while (j < a2.length){
            arr[k] = a2[j];
            k++;
            j++;
        }
        for (int a : arr){
            System.out.print(a+" ");
        }
     }
    public static void main(String[] args) {
        int[] a1 = { 1,2,5,8,9,12,34,56}; 
        int[] a2 = {0,3,8}; 
        merge(a1, a2);
    }
}