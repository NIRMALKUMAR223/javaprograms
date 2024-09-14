public class OuterDimond {
    
    public static void main(String[] args) {
        int n=7,space =n/2,star =1; 
        for (int i = 1;i<=n;i++ ){
            for (int j = 1; j<=space;j++){
                System.out.print("  ");
            }
            for ( int k = 1; k<=star; k++){
                if (k==1 || k == star){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if (i<=n/2){
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
