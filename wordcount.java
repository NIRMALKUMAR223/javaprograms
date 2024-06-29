class wordcount
{
    public static void main(String[] args)
    {
        String str="father of java is james gosling";
        char[] ch=str.toCharArray();
        int wordcount=1;
        for  (char c: ch)
        {
            if (c==' ')
            {
                wordcount++;
            }
        }
        System.out.println(wordcount);
    }
}