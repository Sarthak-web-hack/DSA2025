class bionomial{
    public int fact( int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public  int bio(int n,int r)
    {
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nr_fact=fact(n-r);
        int resultbio=(n_fact/(r_fact*nr_fact));
        return resultbio;
    }
    public static void main(String[] args) {
        bionomial b1=new bionomial();
        int res=b1.bio( 5,2);
        System.out.println("The bionomial corfficient of number="+res);
    }
}