class recurse{
    public static void main(String[] args) {
        f(0);
    }

    public static void f(int count)
    {
        if(count==4)
        {
            return;
        }
        count++;
        System.out.println(count);
        f(count);
    }
}