public class RepeatedElementSameArray {
    static void repeatElement(int[] arr){
        int k = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[k] = arr[i];
                    k++;
                }
            }
        }
        for (int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,3,6,1}; // 1,3,6
        repeatElement(arr);
    }
}
