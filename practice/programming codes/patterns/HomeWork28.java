public class HomeWork28 {
    public static void main(String[] args) {
        int number= 5,space=number,star=1;
        for (int i=1;i<=number;i++){
            for (int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=star;k++){
                // int count=1;
                // if (count==number/2){
                //     System.out.print("h" +" ");
                // }
                // else{
                //     System.out.print(count-- +" ");
                // }
                // count++;
            }
            if (i<=number/2){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}