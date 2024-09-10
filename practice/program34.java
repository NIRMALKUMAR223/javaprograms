public class program34 {
    static void countPN(int[] arr){
        int pos = 0;
        int neg = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println("Positive Number : "+pos);
        System.out.println("Negative Number : "+neg);
    }
    public static void main(String[] args) {
        int[] arr = {1,453,6,-46,34,-23,13,-53,4};
        countPN(arr);
    }
}
