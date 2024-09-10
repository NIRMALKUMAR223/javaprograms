public class HomeWork24 {
    
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i <=number; i++){
            for (int j =0; j<=number; j++ ){
                if (j==0 || i==j && i <= number/2|| i+j== number && i<=number/2|| j==number){
                    System.out.print("*" +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
