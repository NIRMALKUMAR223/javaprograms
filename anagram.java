import java.util.*;
public class anagram {
    static String check(char[] character)
    {
        char temp;
        for (int i=0;i<character.length;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if (character[j]>character[i])
                {
                    temp=character[i];
                    character[i]=character[j];
                    character[j]=temp;
                }
            }
        }
        return new String(character);
    }
    static void anagrami (String string1,String string2)
    {

        char[] character1=string1.toCharArray();  
        char[] character2=string2.toCharArray();
        String sorted1=check(character1);
        String sorted2=check(character2);
        System.out.println(sorted1 + " "+sorted2);
        if (sorted1.equals(sorted2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not An Anagram");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        anagrami(s1, s2);   
        sc.close();
    }
}
