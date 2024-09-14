public class MinElement {
    public static void main(String[] args) {
        int arr[] = {12,34,5,7,567,32,23,21};
        int min = arr[0];
        for (int i =0 ; i <arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
