import java.util.Arrays;

public class MergeToArrayElements {
    public static void main(String[] args) {
        int arr1[] = {1, 6, 8, 23, 23}; 
        int arr2[] = {0, 43, 45, 76, 98,100,1223,121,555};
        int arr3[] = new int[arr1.length+arr2.length];
        int i=0;
        for (;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for (int j=0;j<arr2.length;j++){ //     arr3[i + arr1.length] 
            arr3[i++] = arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
