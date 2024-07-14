public class HallowTriangle {
    public static void main(String[] args) {
        int number=10;
        for (int i=0; i<number; i++){
            for (int k=number; k>i; k--){
                System.out.print(" ");
            }
            for (int j=i; j<i*2; j++){
                if (j==i || j==2*i-1 || i==number-1 ){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}