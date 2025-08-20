class invertednumberpraymid
{
    public void praymid()
    { int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        {
            invertednumberpraymid i1=new invertednumberpraymid();
            i1.praymid();
        }
    }

}