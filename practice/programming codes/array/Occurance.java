public class Occurance {
    public static void main(String[] args) {
        int[] arr ={1,3,6,8,1,3,4,1,1,3};
        for (int i=0; i<arr.length; i++){
            int count = 0;
            for (int j=0; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count+=1;
                }
            }
            if (true){
                System.out.println(arr[i] +" "+count );
            }
        }
    }
}
