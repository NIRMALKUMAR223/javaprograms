class TestArray{
    public static void main(String[] args) {
        Object o[] = new Object[4];
        o[0]='a';
        o[1]=123;
        o[2]="asdfg";
        o[3]=123.1;
        for (Object i:o){
            System.out.println(i);
        }
    }
}