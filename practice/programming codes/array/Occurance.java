public class Occurance {
    public static void main(String[] args) {
        int[] arr ={10,50,20,30,20,10,};
        boolean b[] = new  boolean[arr.length];
        for (int i=0; i<arr.length; i++){
            int count = 1;
            if(b[i]==false){
                for (int j=i+1; j<arr.length; j++){
                    if (arr[i] == arr[j]){
                        count+=1;
                        b[j] = true;
                    }
                }
                System.out.println(arr[i] +" "+count );
            }
        }
    }
}
// Another Logic ------------------------------------------------->1
// int[] arr ={10,20,30,20,10,};
// for (int i=0; i<arr.length; i++){
//     int count = 1;
//         for (int j=i+1; j<arr.length; j++){
//             if (arr[i] == arr[j]){
//                 count+=1;
//                 arr[j]=0;
//             }
//         }
//         if(arr[i]!=0)
//         System.out.println(arr[i] +" "+count );
// Another Logic----------------------------------------------------->2
// int[] arr ={10,50,20,30,20,10,};
// for (int i=0; i<arr.length; i++){
//     int count = 1;
//     if(arr[i]!=0){
//         for (int j=i+1; j<arr.length; j++){
//             if (arr[i] == arr[j]){
// count+=1;
//                 arr[j]=0;
//             }
//         }
//         System.out.println(arr[i] +" "+count );
//     }