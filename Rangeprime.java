
import java.util.Scanner;

class Rangeprime{
    
    public boolean  prime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
public void primeinrange(int n){
    for(int i=2;i<=n;i++)
    {
        if(prime(i))
        {
            System.out.print(i+" ");
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        Rangeprime r1=new Rangeprime();
        System.out.println("Enter the range to find all prime number between them");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        r1.primeinrange(n);
    }
}