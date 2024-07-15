public class SecondLargest {
    static void secondLargest(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest : "+arr[arr.length-2]);

    }
    public static void main(String[] args) {
        int[] arr = {1,453,6,46,34,23,13,53,4};
        secondLargest(arr);
    }
}
