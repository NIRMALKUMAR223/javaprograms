public class FirstRepetedElement {
    static void fistRepeat(int[] arr){
        boolean result=false;
        int i=0;
        for (; i<arr.length; i++){
            for (int j=1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    result=true;
                }
            }
            if (result){
                break;
            }
        }
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int[] arr = {6,10,5,4,9,120,4,6,10};
        fistRepeat(arr);    
    }
}
