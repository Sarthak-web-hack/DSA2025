class Reversenumber{
    public static void main(String[] args) {
        int n=2004,lastdigit,reverse=0;
        while(n>0)
        {
            lastdigit=n%10;
            n=n/10;
            reverse=(reverse*10)+lastdigit;


        }
        System.out.println("The final reverse number is ="+reverse);
    }
}