class  InvertedPraymid{
    public void inverted(int row,int col)
    {
        for(int i=1;i<=row;i++)
        {
            //printing the space frist
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            //printing the stars
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedPraymid i1=new InvertedPraymid();
        i1.inverted(4,4);
    }
}