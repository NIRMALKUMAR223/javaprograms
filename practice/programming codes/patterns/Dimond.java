 class Dimond{

    //easy to print dimond;
    public static void main(String[] args) {
        int n=7,space =0,star =n; // for dimond space will start from n/2 and each time start will start from 1;
        for (int i = 1;i<=n;i++ ){
            for (int j = 1; j<=space;j++){
                System.out.print("  ");
            }
            for ( int k = 1; k<=star; k++){
                System.out.print("* ");
            }
            if (i<=n/2){
                space++; // for dimond space minus minus and star plus 2;
                star-=2;
            }
            else{
                space--;
                star+=2;
            }
            System.out.println();
        }
    }
 }