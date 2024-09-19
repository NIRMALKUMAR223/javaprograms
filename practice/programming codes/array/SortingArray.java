import java.util.Arrays;

class SortingArray{
    public static void main(String[] args) {
        int arr[] = {98,76,43,23,45,23,1,6,8};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}