class floydtriangle
{
    int n=5;
    int counter=1;
    public void triangle()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydtriangle f1=new floydtriangle();
        f1.triangle();
    }
}