import java.util.Scanner;
class Test 
{
  static boolean check(int number)
  {
    int digit=0;
    boolean check=false;
    while (number!=0)
    {
      int last=number%10;
      if (digit==last)
      {
        check=true;
        break;
      }
      number/=10;
    }
    return check;
  }
}

public class DuckNumber 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int number =sc.nextInt();
    if (number>0)
    {
      boolean result=Test.check(number);
      if (result)
      {
        System.out.println("duck");
      }
      else
      {
        System.out.println("not duck");
      }
    }
    else 
    {
      System.out.println("invalid number");
    }
    sc.close();
  }
}