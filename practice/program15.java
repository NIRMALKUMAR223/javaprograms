public class program15 {
    public static void main(String[] args) {
        int number=3434;
        int sum1=number%10,sum2=0;
        number/=10;
        while (number>9)
        {
            int last=number%10;
            sum2+=last;
            number/=10;
        }
        sum1+=number;
        if (sum1==sum2)
        {
            System.out.println("harmony");
        }
        else
        {
            System.out.println("not harmony");
        }
    }
}
