class invertedprymaid{
    public void inverted(int row,int col)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i+j==3 || i+j==4 || i+j==2)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedprymaid i1=new invertedprymaid();
        i1.inverted(4,4);
    }
}