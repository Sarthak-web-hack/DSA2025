import java.util.Scanner;

class isprime
{
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        boolean IsPrime = true;
        if(n==2)
        {
            System.out.println("THe entred number is prime");
        }
        else
        {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                IsPrime = false;
            }
            
        }
        if(IsPrime == true)
        {
            System.out.println("n is prime");
        }
        else{
            System.out.println("N is not prime");
        }
        }
    }
}