class factorial{
    public int fact( int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        factorial f1=new factorial();
        int result=f1.fact(10);
        System.out.println("Factorial of number="+result);
        
    }
}