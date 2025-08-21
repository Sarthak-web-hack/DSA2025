class hollowrhombus
{
    public void rhombus()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int h=1;h<=(n-i);h++)
            {
                System.out.print(" ");
            }
            for(int h=1;h<=n;h++)
            {
               if(i==1||i==n||h==1||h==n)
               {
                 System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        hollowrhombus h1=new hollowrhombus();
        h1.rhombus();
    }
}