public class FindMissingNumber {
    static void findMissingNumber(int[] arr){
        int lastNumber = arr[arr.length-1];
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int result =( lastNumber * (lastNumber+1)/2 ) - sum;
        System.out.println(result);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        findMissingNumber(arr);
    }
}
