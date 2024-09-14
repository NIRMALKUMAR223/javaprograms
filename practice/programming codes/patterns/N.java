public class N {
    public static void main(String[] args) {
        int number=7;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
