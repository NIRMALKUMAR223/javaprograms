public class program33 {
    static void count(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even count : "+even);
        System.out.println("Odd count : "+odd);
    }
    public static void main(String[] args) {
        int[] arr = {1,453,6,46,34,23,13,53,4};
        count(arr);
    }
}
