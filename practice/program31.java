public class program31 {
    static boolean evenOrOdd(int[] arr){
        int sum = 0; 
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        if ( sum%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,453,6,46,34,23,13,53,4};
        boolean result = evenOrOdd(arr);
        if (result){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
