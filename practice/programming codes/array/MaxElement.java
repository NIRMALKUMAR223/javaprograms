class MaxElement{
    public static void main(String[] args) {
        int arr[] = {12,34,5,7,567,32,23,21};
        int max = 0;
        for (int i =0 ; i <arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}